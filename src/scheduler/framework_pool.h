#ifndef SRC_SCHEDULER_FRAMEWORK_POOL_H
#define SRC_SCHEDULER_FRAMEWORK_POOL_H

#include <list>
#include <string>
#include <tr1/memory>
#include <tr1/functional>

#include "scheduler/framework.h"
#include "scheduler/task.h"
#include "common/rwlock.h"

using std::string;
using std::list;
using std::tr1::function;
using std::tr1::placeholder::_1;
using std::tr1::placeholder::_2;


class FrameworkPool {
public:
    typedef function<void(Framework*)> FrameworkFunc;

    void Init();
    
    /// add the task into correspond framework
    void AddTask(const TaskPtr& task);
    
    /// find the framework and do func on it
    /// find the framework return true, else return false
    bool FindToDo(const string& name, FrameworkFunc func);

private:
    RWLock m_lock;
    list<Framework> m_framework_pool;
};

typedef Singleton<FrameworkPool> FrameworkMgr;

#endif