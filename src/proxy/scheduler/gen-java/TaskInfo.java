/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskInfo implements org.apache.thrift.TBase<TaskInfo, TaskInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TaskInfo");

  private static final org.apache.thrift.protocol.TField FRAMEWORK_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("framework_name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField CMD_FIELD_DESC = new org.apache.thrift.protocol.TField("cmd", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ARGUMENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("arguments", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CANDIDATE_IPS_FIELD_DESC = new org.apache.thrift.protocol.TField("candidate_ips", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField NEED_CPU_FIELD_DESC = new org.apache.thrift.protocol.TField("need_cpu", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField NEED_MEMORY_FIELD_DESC = new org.apache.thrift.protocol.TField("need_memory", org.apache.thrift.protocol.TType.I32, (short)7);

  public String framework_name;
  public long id;
  public String cmd;
  public String arguments;
  public String candidate_ips;
  public double need_cpu;
  public int need_memory;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FRAMEWORK_NAME((short)1, "framework_name"),
    ID((short)2, "id"),
    CMD((short)3, "cmd"),
    ARGUMENTS((short)4, "arguments"),
    CANDIDATE_IPS((short)5, "candidate_ips"),
    NEED_CPU((short)6, "need_cpu"),
    NEED_MEMORY((short)7, "need_memory");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FRAMEWORK_NAME
          return FRAMEWORK_NAME;
        case 2: // ID
          return ID;
        case 3: // CMD
          return CMD;
        case 4: // ARGUMENTS
          return ARGUMENTS;
        case 5: // CANDIDATE_IPS
          return CANDIDATE_IPS;
        case 6: // NEED_CPU
          return NEED_CPU;
        case 7: // NEED_MEMORY
          return NEED_MEMORY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __NEED_CPU_ISSET_ID = 1;
  private static final int __NEED_MEMORY_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FRAMEWORK_NAME, new org.apache.thrift.meta_data.FieldMetaData("framework_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CMD, new org.apache.thrift.meta_data.FieldMetaData("cmd", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ARGUMENTS, new org.apache.thrift.meta_data.FieldMetaData("arguments", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CANDIDATE_IPS, new org.apache.thrift.meta_data.FieldMetaData("candidate_ips", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NEED_CPU, new org.apache.thrift.meta_data.FieldMetaData("need_cpu", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.NEED_MEMORY, new org.apache.thrift.meta_data.FieldMetaData("need_memory", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TaskInfo.class, metaDataMap);
  }

  public TaskInfo() {
  }

  public TaskInfo(
    String framework_name,
    long id,
    String cmd)
  {
    this();
    this.framework_name = framework_name;
    this.id = id;
    setIdIsSet(true);
    this.cmd = cmd;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskInfo(TaskInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetFramework_name()) {
      this.framework_name = other.framework_name;
    }
    this.id = other.id;
    if (other.isSetCmd()) {
      this.cmd = other.cmd;
    }
    if (other.isSetArguments()) {
      this.arguments = other.arguments;
    }
    if (other.isSetCandidate_ips()) {
      this.candidate_ips = other.candidate_ips;
    }
    this.need_cpu = other.need_cpu;
    this.need_memory = other.need_memory;
  }

  public TaskInfo deepCopy() {
    return new TaskInfo(this);
  }

  @Override
  public void clear() {
    this.framework_name = null;
    setIdIsSet(false);
    this.id = 0;
    this.cmd = null;
    this.arguments = null;
    this.candidate_ips = null;
    setNeed_cpuIsSet(false);
    this.need_cpu = 0.0;
    setNeed_memoryIsSet(false);
    this.need_memory = 0;
  }

  public String getFramework_name() {
    return this.framework_name;
  }

  public TaskInfo setFramework_name(String framework_name) {
    this.framework_name = framework_name;
    return this;
  }

  public void unsetFramework_name() {
    this.framework_name = null;
  }

  /** Returns true if field framework_name is set (has been assigned a value) and false otherwise */
  public boolean isSetFramework_name() {
    return this.framework_name != null;
  }

  public void setFramework_nameIsSet(boolean value) {
    if (!value) {
      this.framework_name = null;
    }
  }

  public long getId() {
    return this.id;
  }

  public TaskInfo setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bit_vector.clear(__ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return __isset_bit_vector.get(__ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bit_vector.set(__ID_ISSET_ID, value);
  }

  public String getCmd() {
    return this.cmd;
  }

  public TaskInfo setCmd(String cmd) {
    this.cmd = cmd;
    return this;
  }

  public void unsetCmd() {
    this.cmd = null;
  }

  /** Returns true if field cmd is set (has been assigned a value) and false otherwise */
  public boolean isSetCmd() {
    return this.cmd != null;
  }

  public void setCmdIsSet(boolean value) {
    if (!value) {
      this.cmd = null;
    }
  }

  public String getArguments() {
    return this.arguments;
  }

  public TaskInfo setArguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

  public void unsetArguments() {
    this.arguments = null;
  }

  /** Returns true if field arguments is set (has been assigned a value) and false otherwise */
  public boolean isSetArguments() {
    return this.arguments != null;
  }

  public void setArgumentsIsSet(boolean value) {
    if (!value) {
      this.arguments = null;
    }
  }

  public String getCandidate_ips() {
    return this.candidate_ips;
  }

  public TaskInfo setCandidate_ips(String candidate_ips) {
    this.candidate_ips = candidate_ips;
    return this;
  }

  public void unsetCandidate_ips() {
    this.candidate_ips = null;
  }

  /** Returns true if field candidate_ips is set (has been assigned a value) and false otherwise */
  public boolean isSetCandidate_ips() {
    return this.candidate_ips != null;
  }

  public void setCandidate_ipsIsSet(boolean value) {
    if (!value) {
      this.candidate_ips = null;
    }
  }

  public double getNeed_cpu() {
    return this.need_cpu;
  }

  public TaskInfo setNeed_cpu(double need_cpu) {
    this.need_cpu = need_cpu;
    setNeed_cpuIsSet(true);
    return this;
  }

  public void unsetNeed_cpu() {
    __isset_bit_vector.clear(__NEED_CPU_ISSET_ID);
  }

  /** Returns true if field need_cpu is set (has been assigned a value) and false otherwise */
  public boolean isSetNeed_cpu() {
    return __isset_bit_vector.get(__NEED_CPU_ISSET_ID);
  }

  public void setNeed_cpuIsSet(boolean value) {
    __isset_bit_vector.set(__NEED_CPU_ISSET_ID, value);
  }

  public int getNeed_memory() {
    return this.need_memory;
  }

  public TaskInfo setNeed_memory(int need_memory) {
    this.need_memory = need_memory;
    setNeed_memoryIsSet(true);
    return this;
  }

  public void unsetNeed_memory() {
    __isset_bit_vector.clear(__NEED_MEMORY_ISSET_ID);
  }

  /** Returns true if field need_memory is set (has been assigned a value) and false otherwise */
  public boolean isSetNeed_memory() {
    return __isset_bit_vector.get(__NEED_MEMORY_ISSET_ID);
  }

  public void setNeed_memoryIsSet(boolean value) {
    __isset_bit_vector.set(__NEED_MEMORY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FRAMEWORK_NAME:
      if (value == null) {
        unsetFramework_name();
      } else {
        setFramework_name((String)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case CMD:
      if (value == null) {
        unsetCmd();
      } else {
        setCmd((String)value);
      }
      break;

    case ARGUMENTS:
      if (value == null) {
        unsetArguments();
      } else {
        setArguments((String)value);
      }
      break;

    case CANDIDATE_IPS:
      if (value == null) {
        unsetCandidate_ips();
      } else {
        setCandidate_ips((String)value);
      }
      break;

    case NEED_CPU:
      if (value == null) {
        unsetNeed_cpu();
      } else {
        setNeed_cpu((Double)value);
      }
      break;

    case NEED_MEMORY:
      if (value == null) {
        unsetNeed_memory();
      } else {
        setNeed_memory((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FRAMEWORK_NAME:
      return getFramework_name();

    case ID:
      return new Long(getId());

    case CMD:
      return getCmd();

    case ARGUMENTS:
      return getArguments();

    case CANDIDATE_IPS:
      return getCandidate_ips();

    case NEED_CPU:
      return new Double(getNeed_cpu());

    case NEED_MEMORY:
      return new Integer(getNeed_memory());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FRAMEWORK_NAME:
      return isSetFramework_name();
    case ID:
      return isSetId();
    case CMD:
      return isSetCmd();
    case ARGUMENTS:
      return isSetArguments();
    case CANDIDATE_IPS:
      return isSetCandidate_ips();
    case NEED_CPU:
      return isSetNeed_cpu();
    case NEED_MEMORY:
      return isSetNeed_memory();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskInfo)
      return this.equals((TaskInfo)that);
    return false;
  }

  public boolean equals(TaskInfo that) {
    if (that == null)
      return false;

    boolean this_present_framework_name = true && this.isSetFramework_name();
    boolean that_present_framework_name = true && that.isSetFramework_name();
    if (this_present_framework_name || that_present_framework_name) {
      if (!(this_present_framework_name && that_present_framework_name))
        return false;
      if (!this.framework_name.equals(that.framework_name))
        return false;
    }

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_cmd = true && this.isSetCmd();
    boolean that_present_cmd = true && that.isSetCmd();
    if (this_present_cmd || that_present_cmd) {
      if (!(this_present_cmd && that_present_cmd))
        return false;
      if (!this.cmd.equals(that.cmd))
        return false;
    }

    boolean this_present_arguments = true && this.isSetArguments();
    boolean that_present_arguments = true && that.isSetArguments();
    if (this_present_arguments || that_present_arguments) {
      if (!(this_present_arguments && that_present_arguments))
        return false;
      if (!this.arguments.equals(that.arguments))
        return false;
    }

    boolean this_present_candidate_ips = true && this.isSetCandidate_ips();
    boolean that_present_candidate_ips = true && that.isSetCandidate_ips();
    if (this_present_candidate_ips || that_present_candidate_ips) {
      if (!(this_present_candidate_ips && that_present_candidate_ips))
        return false;
      if (!this.candidate_ips.equals(that.candidate_ips))
        return false;
    }

    boolean this_present_need_cpu = true && this.isSetNeed_cpu();
    boolean that_present_need_cpu = true && that.isSetNeed_cpu();
    if (this_present_need_cpu || that_present_need_cpu) {
      if (!(this_present_need_cpu && that_present_need_cpu))
        return false;
      if (this.need_cpu != that.need_cpu)
        return false;
    }

    boolean this_present_need_memory = true && this.isSetNeed_memory();
    boolean that_present_need_memory = true && that.isSetNeed_memory();
    if (this_present_need_memory || that_present_need_memory) {
      if (!(this_present_need_memory && that_present_need_memory))
        return false;
      if (this.need_memory != that.need_memory)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TaskInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TaskInfo typedOther = (TaskInfo)other;

    lastComparison = Boolean.valueOf(isSetFramework_name()).compareTo(typedOther.isSetFramework_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFramework_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.framework_name, typedOther.framework_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCmd()).compareTo(typedOther.isSetCmd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCmd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cmd, typedOther.cmd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArguments()).compareTo(typedOther.isSetArguments());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArguments()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.arguments, typedOther.arguments);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCandidate_ips()).compareTo(typedOther.isSetCandidate_ips());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCandidate_ips()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.candidate_ips, typedOther.candidate_ips);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNeed_cpu()).compareTo(typedOther.isSetNeed_cpu());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNeed_cpu()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.need_cpu, typedOther.need_cpu);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNeed_memory()).compareTo(typedOther.isSetNeed_memory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNeed_memory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.need_memory, typedOther.need_memory);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // FRAMEWORK_NAME
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.framework_name = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.id = iprot.readI64();
            setIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // CMD
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.cmd = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // ARGUMENTS
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.arguments = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // CANDIDATE_IPS
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.candidate_ips = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // NEED_CPU
          if (field.type == org.apache.thrift.protocol.TType.DOUBLE) {
            this.need_cpu = iprot.readDouble();
            setNeed_cpuIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // NEED_MEMORY
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.need_memory = iprot.readI32();
            setNeed_memoryIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.framework_name != null) {
      oprot.writeFieldBegin(FRAMEWORK_NAME_FIELD_DESC);
      oprot.writeString(this.framework_name);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ID_FIELD_DESC);
    oprot.writeI64(this.id);
    oprot.writeFieldEnd();
    if (this.cmd != null) {
      oprot.writeFieldBegin(CMD_FIELD_DESC);
      oprot.writeString(this.cmd);
      oprot.writeFieldEnd();
    }
    if (this.arguments != null) {
      if (isSetArguments()) {
        oprot.writeFieldBegin(ARGUMENTS_FIELD_DESC);
        oprot.writeString(this.arguments);
        oprot.writeFieldEnd();
      }
    }
    if (this.candidate_ips != null) {
      if (isSetCandidate_ips()) {
        oprot.writeFieldBegin(CANDIDATE_IPS_FIELD_DESC);
        oprot.writeString(this.candidate_ips);
        oprot.writeFieldEnd();
      }
    }
    if (isSetNeed_cpu()) {
      oprot.writeFieldBegin(NEED_CPU_FIELD_DESC);
      oprot.writeDouble(this.need_cpu);
      oprot.writeFieldEnd();
    }
    if (isSetNeed_memory()) {
      oprot.writeFieldBegin(NEED_MEMORY_FIELD_DESC);
      oprot.writeI32(this.need_memory);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TaskInfo(");
    boolean first = true;

    sb.append("framework_name:");
    if (this.framework_name == null) {
      sb.append("null");
    } else {
      sb.append(this.framework_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("cmd:");
    if (this.cmd == null) {
      sb.append("null");
    } else {
      sb.append(this.cmd);
    }
    first = false;
    if (isSetArguments()) {
      if (!first) sb.append(", ");
      sb.append("arguments:");
      if (this.arguments == null) {
        sb.append("null");
      } else {
        sb.append(this.arguments);
      }
      first = false;
    }
    if (isSetCandidate_ips()) {
      if (!first) sb.append(", ");
      sb.append("candidate_ips:");
      if (this.candidate_ips == null) {
        sb.append("null");
      } else {
        sb.append(this.candidate_ips);
      }
      first = false;
    }
    if (isSetNeed_cpu()) {
      if (!first) sb.append(", ");
      sb.append("need_cpu:");
      sb.append(this.need_cpu);
      first = false;
    }
    if (isSetNeed_memory()) {
      if (!first) sb.append(", ");
      sb.append("need_memory:");
      sb.append(this.need_memory);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (framework_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'framework_name' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    if (cmd == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'cmd' was not present! Struct: " + toString());
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

