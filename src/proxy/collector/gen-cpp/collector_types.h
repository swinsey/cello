/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
#ifndef collector_TYPES_H
#define collector_TYPES_H

#include <Thrift.h>
#include <TApplicationException.h>
#include <protocol/TProtocol.h>
#include <transport/TTransport.h>





typedef struct _MachineInfo__isset {
  _MachineInfo__isset() : cpu(false), memory(false), avail_cpu(false), avail_memory(false), task_num(false) {}
  bool cpu;
  bool memory;
  bool avail_cpu;
  bool avail_memory;
  bool task_num;
} _MachineInfo__isset;

class MachineInfo {
 public:

  static const char* ascii_fingerprint; // = "E42E0C004BE60620A39AF9F925B574C3";
  static const uint8_t binary_fingerprint[16]; // = {0xE4,0x2E,0x0C,0x00,0x4B,0xE6,0x06,0x20,0xA3,0x9A,0xF9,0xF9,0x25,0xB5,0x74,0xC3};

  MachineInfo() : endpoint(""), load(0), cpu(0), memory(0), avail_cpu(0), avail_memory(0), task_num(0) {
  }

  virtual ~MachineInfo() {}

  std::string endpoint;
  double load;
  int32_t cpu;
  int32_t memory;
  double avail_cpu;
  int32_t avail_memory;
  int32_t task_num;

  _MachineInfo__isset __isset;

  bool operator == (const MachineInfo & rhs) const
  {
    if (!(endpoint == rhs.endpoint))
      return false;
    if (!(load == rhs.load))
      return false;
    if (__isset.cpu != rhs.__isset.cpu)
      return false;
    else if (__isset.cpu && !(cpu == rhs.cpu))
      return false;
    if (__isset.memory != rhs.__isset.memory)
      return false;
    else if (__isset.memory && !(memory == rhs.memory))
      return false;
    if (__isset.avail_cpu != rhs.__isset.avail_cpu)
      return false;
    else if (__isset.avail_cpu && !(avail_cpu == rhs.avail_cpu))
      return false;
    if (__isset.avail_memory != rhs.__isset.avail_memory)
      return false;
    else if (__isset.avail_memory && !(avail_memory == rhs.avail_memory))
      return false;
    if (__isset.task_num != rhs.__isset.task_num)
      return false;
    else if (__isset.task_num && !(task_num == rhs.task_num))
      return false;
    return true;
  }
  bool operator != (const MachineInfo &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const MachineInfo & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};



#endif
