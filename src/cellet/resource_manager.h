#ifndef SRC_CELLET_RESOURCE_MANAGER
#define SRC_CELLET_RESOURCE_MANAGER

#include <string>

#include "common/singleton.h"
#include "proxy/collector/gen-cpp/Collector.h"

#include "cellet/container.h"

using std::string;

class ResourceManager {
public:
    /// @brief: initilize resource information
    void Init();
    
    /// @brief: compute and get current machine information
    MachineInfo GetMachineInfo();
    
    void GetUsedResource(Container* ptr);

    void SendData();
private:
    MessageQueue::Message ToMessage(const MachineInfo& info);
private:
    string m_endpoint;
    int m_total_cpu;
    double m_avail_cpu;
    int m_total_memory;
    int m_avail_memory;
    double m_cpu_usage;
};

typedef Singleton<ResourceManager> ResourceMgr;

#endif
