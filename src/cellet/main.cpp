#include <sys/types.h>
#include <sys/stat.h>
#include <sys/wait.h>
#include <unistd.h>

#include "glog/logging.h"
#include "gflags/gflags.h"

#include "cellet/cellet.h"
#include "cellet/message_manager.h"
#include "cellet/container_pool.h"
#include "common/rpc.h"

DEFINE_int32(port, 9998, "cellet port");
DEFINE_string(work_directory, "/tmp/cello", "cellet work directory");
DEFINE_string(scheduler_endpoint, "10.5.0.170:9998", "scheduler endpoint");

void ResourceManagerEntry() {
    // if temperory directory does not exist then create it
    if (access(FLAGS_work_directory.c_str(), F_OK) < 0)
        mkdir(FLAGS_work_directory.c_str(), S_IRWXU|S_IRWXG|S_IROTH);
    pthread_t start_executor_t, resoure_info_t;
    pthread_create(&start_executor_t, NULL, StartExecutorReceiver, NULL);
    pthread_create(&resoure_info_t, NULL, ResourceInfoSender, NULL);

    // wait pid for task execution finished
    pid_t pid;
    int status;
    while((pid = waitpid(-1, &status, WNOHANG)) > 0) {
        ContainerPool::ContainerFunc func = bind(&Container::ContainerFinished,
                                                 _1);
        // find the container and deal with the thing
        if(ContainerMgr::Instance()->FindToDo(pid, func)) {
            // remove the container since it has finished
            ContainerMgr::Instance()->Delete(pid);
        }
    }
} 

int main(int argc, char ** argv) {
    // set up flags
    if (argc > 1)
        google::ParseCommandLineFlags(&argc, &argv, true);
    else
        google::ReadFromFlagsFile("../conf/cellet.conf", argv[0], true);
    
    // initilize log
    google::InitGoogleLogging(argv[0]);
    google::SetLogDestination(google::INFO, "../log/cellet_info_");
    google::SetLogDestination(google::WARNING, "../log/cellet_warning_");
    google::SetLogDestination(google::ERROR, "../log/cellet_error_");
    google::SetLogDestination(google::FATAL, "../log/cellet_fatal_");
    LOG(INFO) << "begin cellet";
    // init message queue
    MsgQueueMgr::Instance()->Init();
    pid_t res_manager_pid = fork();
    if (res_manager_pid != 0) {
        pthread_t res_info_recv_t, start_exec_t, exec_status_recv_t;
        // start executor thread
        pthread_create(&start_exec_t, NULL, StartExecutorSender, NULL);
        // resouce information 
        pthread_create(&res_info_recv_t, NULL, ResourceInfoReceiver, NULL);
        // receive executor status thread
        pthread_create(&exec_status_recv_t, NULL, ExecutorStatusReceiver, NULL)
        Rpc<Cellet, CelletProcessor>::Listen(FLAGS_port); 
        return 0;
    } else {
        // resource manager process
        ResourceManagerEntry();
    }
}
