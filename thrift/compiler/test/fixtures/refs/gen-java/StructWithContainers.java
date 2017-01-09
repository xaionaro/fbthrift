/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class StructWithContainers implements TBase, java.io.Serializable, Cloneable, Comparable<StructWithContainers> {
  private static final TStruct STRUCT_DESC = new TStruct("StructWithContainers");
  private static final TField LIST_REF_FIELD_DESC = new TField("list_ref", TType.LIST, (short)1);
  private static final TField SET_REF_FIELD_DESC = new TField("set_ref", TType.SET, (short)2);
  private static final TField MAP_REF_FIELD_DESC = new TField("map_ref", TType.MAP, (short)3);
  private static final TField LIST_REF_UNIQUE_FIELD_DESC = new TField("list_ref_unique", TType.LIST, (short)4);
  private static final TField SET_REF_SHARED_FIELD_DESC = new TField("set_ref_shared", TType.SET, (short)5);
  private static final TField MAP_REF_CUSTOM_FIELD_DESC = new TField("map_ref_custom", TType.MAP, (short)6);
  private static final TField LIST_REF_SHARED_CONST_FIELD_DESC = new TField("list_ref_shared_const", TType.LIST, (short)7);
  private static final TField SET_CUSTOM_REF_FIELD_DESC = new TField("set_custom_ref", TType.SET, (short)8);

  public List<Integer> list_ref;
  public Set<Integer> set_ref;
  public Map<Integer,Integer> map_ref;
  public List<Integer> list_ref_unique;
  public Set<Integer> set_ref_shared;
  public Map<Integer,Integer> map_ref_custom;
  public List<Integer> list_ref_shared_const;
  public Set<Integer> set_custom_ref;
  public static final int LIST_REF = 1;
  public static final int SET_REF = 2;
  public static final int MAP_REF = 3;
  public static final int LIST_REF_UNIQUE = 4;
  public static final int SET_REF_SHARED = 5;
  public static final int MAP_REF_CUSTOM = 6;
  public static final int LIST_REF_SHARED_CONST = 7;
  public static final int SET_CUSTOM_REF = 8;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(LIST_REF, new FieldMetaData("list_ref", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(SET_REF, new FieldMetaData("set_ref", TFieldRequirementType.DEFAULT, 
        new SetMetaData(TType.SET, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(MAP_REF, new FieldMetaData("map_ref", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(LIST_REF_UNIQUE, new FieldMetaData("list_ref_unique", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(SET_REF_SHARED, new FieldMetaData("set_ref_shared", TFieldRequirementType.DEFAULT, 
        new SetMetaData(TType.SET, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(MAP_REF_CUSTOM, new FieldMetaData("map_ref_custom", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(LIST_REF_SHARED_CONST, new FieldMetaData("list_ref_shared_const", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(SET_CUSTOM_REF, new FieldMetaData("set_custom_ref", TFieldRequirementType.DEFAULT, 
        new SetMetaData(TType.SET, 
            new FieldValueMetaData(TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(StructWithContainers.class, metaDataMap);
  }

  public StructWithContainers() {
  }

  public StructWithContainers(
    List<Integer> list_ref,
    Set<Integer> set_ref,
    Map<Integer,Integer> map_ref,
    List<Integer> list_ref_unique,
    Set<Integer> set_ref_shared,
    Map<Integer,Integer> map_ref_custom,
    List<Integer> list_ref_shared_const,
    Set<Integer> set_custom_ref)
  {
    this();
    this.list_ref = list_ref;
    this.set_ref = set_ref;
    this.map_ref = map_ref;
    this.list_ref_unique = list_ref_unique;
    this.set_ref_shared = set_ref_shared;
    this.map_ref_custom = map_ref_custom;
    this.list_ref_shared_const = list_ref_shared_const;
    this.set_custom_ref = set_custom_ref;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StructWithContainers(StructWithContainers other) {
    if (other.isSetList_ref()) {
      this.list_ref = TBaseHelper.deepCopy(other.list_ref);
    }
    if (other.isSetSet_ref()) {
      this.set_ref = TBaseHelper.deepCopy(other.set_ref);
    }
    if (other.isSetMap_ref()) {
      this.map_ref = TBaseHelper.deepCopy(other.map_ref);
    }
    if (other.isSetList_ref_unique()) {
      this.list_ref_unique = TBaseHelper.deepCopy(other.list_ref_unique);
    }
    if (other.isSetSet_ref_shared()) {
      this.set_ref_shared = TBaseHelper.deepCopy(other.set_ref_shared);
    }
    if (other.isSetMap_ref_custom()) {
      this.map_ref_custom = TBaseHelper.deepCopy(other.map_ref_custom);
    }
    if (other.isSetList_ref_shared_const()) {
      this.list_ref_shared_const = TBaseHelper.deepCopy(other.list_ref_shared_const);
    }
    if (other.isSetSet_custom_ref()) {
      this.set_custom_ref = TBaseHelper.deepCopy(other.set_custom_ref);
    }
  }

  public StructWithContainers deepCopy() {
    return new StructWithContainers(this);
  }

  @Deprecated
  public StructWithContainers clone() {
    return new StructWithContainers(this);
  }

  public List<Integer>  getList_ref() {
    return this.list_ref;
  }

  public StructWithContainers setList_ref(List<Integer> list_ref) {
    this.list_ref = list_ref;
    return this;
  }

  public void unsetList_ref() {
    this.list_ref = null;
  }

  // Returns true if field list_ref is set (has been assigned a value) and false otherwise
  public boolean isSetList_ref() {
    return this.list_ref != null;
  }

  public void setList_refIsSet(boolean value) {
    if (!value) {
      this.list_ref = null;
    }
  }

  public Set<Integer>  getSet_ref() {
    return this.set_ref;
  }

  public StructWithContainers setSet_ref(Set<Integer> set_ref) {
    this.set_ref = set_ref;
    return this;
  }

  public void unsetSet_ref() {
    this.set_ref = null;
  }

  // Returns true if field set_ref is set (has been assigned a value) and false otherwise
  public boolean isSetSet_ref() {
    return this.set_ref != null;
  }

  public void setSet_refIsSet(boolean value) {
    if (!value) {
      this.set_ref = null;
    }
  }

  public Map<Integer,Integer>  getMap_ref() {
    return this.map_ref;
  }

  public StructWithContainers setMap_ref(Map<Integer,Integer> map_ref) {
    this.map_ref = map_ref;
    return this;
  }

  public void unsetMap_ref() {
    this.map_ref = null;
  }

  // Returns true if field map_ref is set (has been assigned a value) and false otherwise
  public boolean isSetMap_ref() {
    return this.map_ref != null;
  }

  public void setMap_refIsSet(boolean value) {
    if (!value) {
      this.map_ref = null;
    }
  }

  public List<Integer>  getList_ref_unique() {
    return this.list_ref_unique;
  }

  public StructWithContainers setList_ref_unique(List<Integer> list_ref_unique) {
    this.list_ref_unique = list_ref_unique;
    return this;
  }

  public void unsetList_ref_unique() {
    this.list_ref_unique = null;
  }

  // Returns true if field list_ref_unique is set (has been assigned a value) and false otherwise
  public boolean isSetList_ref_unique() {
    return this.list_ref_unique != null;
  }

  public void setList_ref_uniqueIsSet(boolean value) {
    if (!value) {
      this.list_ref_unique = null;
    }
  }

  public Set<Integer>  getSet_ref_shared() {
    return this.set_ref_shared;
  }

  public StructWithContainers setSet_ref_shared(Set<Integer> set_ref_shared) {
    this.set_ref_shared = set_ref_shared;
    return this;
  }

  public void unsetSet_ref_shared() {
    this.set_ref_shared = null;
  }

  // Returns true if field set_ref_shared is set (has been assigned a value) and false otherwise
  public boolean isSetSet_ref_shared() {
    return this.set_ref_shared != null;
  }

  public void setSet_ref_sharedIsSet(boolean value) {
    if (!value) {
      this.set_ref_shared = null;
    }
  }

  public Map<Integer,Integer>  getMap_ref_custom() {
    return this.map_ref_custom;
  }

  public StructWithContainers setMap_ref_custom(Map<Integer,Integer> map_ref_custom) {
    this.map_ref_custom = map_ref_custom;
    return this;
  }

  public void unsetMap_ref_custom() {
    this.map_ref_custom = null;
  }

  // Returns true if field map_ref_custom is set (has been assigned a value) and false otherwise
  public boolean isSetMap_ref_custom() {
    return this.map_ref_custom != null;
  }

  public void setMap_ref_customIsSet(boolean value) {
    if (!value) {
      this.map_ref_custom = null;
    }
  }

  public List<Integer>  getList_ref_shared_const() {
    return this.list_ref_shared_const;
  }

  public StructWithContainers setList_ref_shared_const(List<Integer> list_ref_shared_const) {
    this.list_ref_shared_const = list_ref_shared_const;
    return this;
  }

  public void unsetList_ref_shared_const() {
    this.list_ref_shared_const = null;
  }

  // Returns true if field list_ref_shared_const is set (has been assigned a value) and false otherwise
  public boolean isSetList_ref_shared_const() {
    return this.list_ref_shared_const != null;
  }

  public void setList_ref_shared_constIsSet(boolean value) {
    if (!value) {
      this.list_ref_shared_const = null;
    }
  }

  public Set<Integer>  getSet_custom_ref() {
    return this.set_custom_ref;
  }

  public StructWithContainers setSet_custom_ref(Set<Integer> set_custom_ref) {
    this.set_custom_ref = set_custom_ref;
    return this;
  }

  public void unsetSet_custom_ref() {
    this.set_custom_ref = null;
  }

  // Returns true if field set_custom_ref is set (has been assigned a value) and false otherwise
  public boolean isSetSet_custom_ref() {
    return this.set_custom_ref != null;
  }

  public void setSet_custom_refIsSet(boolean value) {
    if (!value) {
      this.set_custom_ref = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case LIST_REF:
      if (value == null) {
        unsetList_ref();
      } else {
        setList_ref((List<Integer>)value);
      }
      break;

    case SET_REF:
      if (value == null) {
        unsetSet_ref();
      } else {
        setSet_ref((Set<Integer>)value);
      }
      break;

    case MAP_REF:
      if (value == null) {
        unsetMap_ref();
      } else {
        setMap_ref((Map<Integer,Integer>)value);
      }
      break;

    case LIST_REF_UNIQUE:
      if (value == null) {
        unsetList_ref_unique();
      } else {
        setList_ref_unique((List<Integer>)value);
      }
      break;

    case SET_REF_SHARED:
      if (value == null) {
        unsetSet_ref_shared();
      } else {
        setSet_ref_shared((Set<Integer>)value);
      }
      break;

    case MAP_REF_CUSTOM:
      if (value == null) {
        unsetMap_ref_custom();
      } else {
        setMap_ref_custom((Map<Integer,Integer>)value);
      }
      break;

    case LIST_REF_SHARED_CONST:
      if (value == null) {
        unsetList_ref_shared_const();
      } else {
        setList_ref_shared_const((List<Integer>)value);
      }
      break;

    case SET_CUSTOM_REF:
      if (value == null) {
        unsetSet_custom_ref();
      } else {
        setSet_custom_ref((Set<Integer>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case LIST_REF:
      return getList_ref();

    case SET_REF:
      return getSet_ref();

    case MAP_REF:
      return getMap_ref();

    case LIST_REF_UNIQUE:
      return getList_ref_unique();

    case SET_REF_SHARED:
      return getSet_ref_shared();

    case MAP_REF_CUSTOM:
      return getMap_ref_custom();

    case LIST_REF_SHARED_CONST:
      return getList_ref_shared_const();

    case SET_CUSTOM_REF:
      return getSet_custom_ref();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case LIST_REF:
      return isSetList_ref();
    case SET_REF:
      return isSetSet_ref();
    case MAP_REF:
      return isSetMap_ref();
    case LIST_REF_UNIQUE:
      return isSetList_ref_unique();
    case SET_REF_SHARED:
      return isSetSet_ref_shared();
    case MAP_REF_CUSTOM:
      return isSetMap_ref_custom();
    case LIST_REF_SHARED_CONST:
      return isSetList_ref_shared_const();
    case SET_CUSTOM_REF:
      return isSetSet_custom_ref();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StructWithContainers)
      return this.equals((StructWithContainers)that);
    return false;
  }

  public boolean equals(StructWithContainers that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_list_ref = true && this.isSetList_ref();
    boolean that_present_list_ref = true && that.isSetList_ref();
    if (this_present_list_ref || that_present_list_ref) {
      if (!(this_present_list_ref && that_present_list_ref))
        return false;
      if (!TBaseHelper.equalsNobinary(this.list_ref, that.list_ref))
        return false;
    }

    boolean this_present_set_ref = true && this.isSetSet_ref();
    boolean that_present_set_ref = true && that.isSetSet_ref();
    if (this_present_set_ref || that_present_set_ref) {
      if (!(this_present_set_ref && that_present_set_ref))
        return false;
      if (!TBaseHelper.equalsNobinary(this.set_ref, that.set_ref))
        return false;
    }

    boolean this_present_map_ref = true && this.isSetMap_ref();
    boolean that_present_map_ref = true && that.isSetMap_ref();
    if (this_present_map_ref || that_present_map_ref) {
      if (!(this_present_map_ref && that_present_map_ref))
        return false;
      if (!TBaseHelper.equalsNobinary(this.map_ref, that.map_ref))
        return false;
    }

    boolean this_present_list_ref_unique = true && this.isSetList_ref_unique();
    boolean that_present_list_ref_unique = true && that.isSetList_ref_unique();
    if (this_present_list_ref_unique || that_present_list_ref_unique) {
      if (!(this_present_list_ref_unique && that_present_list_ref_unique))
        return false;
      if (!TBaseHelper.equalsNobinary(this.list_ref_unique, that.list_ref_unique))
        return false;
    }

    boolean this_present_set_ref_shared = true && this.isSetSet_ref_shared();
    boolean that_present_set_ref_shared = true && that.isSetSet_ref_shared();
    if (this_present_set_ref_shared || that_present_set_ref_shared) {
      if (!(this_present_set_ref_shared && that_present_set_ref_shared))
        return false;
      if (!TBaseHelper.equalsNobinary(this.set_ref_shared, that.set_ref_shared))
        return false;
    }

    boolean this_present_map_ref_custom = true && this.isSetMap_ref_custom();
    boolean that_present_map_ref_custom = true && that.isSetMap_ref_custom();
    if (this_present_map_ref_custom || that_present_map_ref_custom) {
      if (!(this_present_map_ref_custom && that_present_map_ref_custom))
        return false;
      if (!TBaseHelper.equalsNobinary(this.map_ref_custom, that.map_ref_custom))
        return false;
    }

    boolean this_present_list_ref_shared_const = true && this.isSetList_ref_shared_const();
    boolean that_present_list_ref_shared_const = true && that.isSetList_ref_shared_const();
    if (this_present_list_ref_shared_const || that_present_list_ref_shared_const) {
      if (!(this_present_list_ref_shared_const && that_present_list_ref_shared_const))
        return false;
      if (!TBaseHelper.equalsNobinary(this.list_ref_shared_const, that.list_ref_shared_const))
        return false;
    }

    boolean this_present_set_custom_ref = true && this.isSetSet_custom_ref();
    boolean that_present_set_custom_ref = true && that.isSetSet_custom_ref();
    if (this_present_set_custom_ref || that_present_set_custom_ref) {
      if (!(this_present_set_custom_ref && that_present_set_custom_ref))
        return false;
      if (!TBaseHelper.equalsNobinary(this.set_custom_ref, that.set_custom_ref))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(StructWithContainers other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetList_ref()).compareTo(other.isSetList_ref());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(list_ref, other.list_ref);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSet_ref()).compareTo(other.isSetSet_ref());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(set_ref, other.set_ref);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetMap_ref()).compareTo(other.isSetMap_ref());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(map_ref, other.map_ref);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetList_ref_unique()).compareTo(other.isSetList_ref_unique());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(list_ref_unique, other.list_ref_unique);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSet_ref_shared()).compareTo(other.isSetSet_ref_shared());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(set_ref_shared, other.set_ref_shared);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetMap_ref_custom()).compareTo(other.isSetMap_ref_custom());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(map_ref_custom, other.map_ref_custom);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetList_ref_shared_const()).compareTo(other.isSetList_ref_shared_const());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(list_ref_shared_const, other.list_ref_shared_const);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSet_custom_ref()).compareTo(other.isSetSet_custom_ref());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(set_custom_ref, other.set_custom_ref);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case LIST_REF:
          if (field.type == TType.LIST) {
            {
              TList _list19 = iprot.readListBegin();
              this.list_ref = new ArrayList<Integer>(Math.max(0, _list19.size));
              for (int _i20 = 0; 
                   (_list19.size < 0) ? iprot.peekList() : (_i20 < _list19.size); 
                   ++_i20)
              {
                int _elem21;
                _elem21 = iprot.readI32();
                this.list_ref.add(_elem21);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SET_REF:
          if (field.type == TType.SET) {
            {
              TSet _set22 = iprot.readSetBegin();
              this.set_ref = new HashSet<Integer>(Math.max(0, 2*_set22.size));
              for (int _i23 = 0; 
                   (_set22.size < 0) ? iprot.peekSet() : (_i23 < _set22.size); 
                   ++_i23)
              {
                int _elem24;
                _elem24 = iprot.readI32();
                this.set_ref.add(_elem24);
              }
              iprot.readSetEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MAP_REF:
          if (field.type == TType.MAP) {
            {
              TMap _map25 = iprot.readMapBegin();
              this.map_ref = new HashMap<Integer,Integer>(Math.max(0, 2*_map25.size));
              for (int _i26 = 0; 
                   (_map25.size < 0) ? iprot.peekMap() : (_i26 < _map25.size); 
                   ++_i26)
              {
                int _key27;
                int _val28;
                _key27 = iprot.readI32();
                _val28 = iprot.readI32();
                this.map_ref.put(_key27, _val28);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LIST_REF_UNIQUE:
          if (field.type == TType.LIST) {
            {
              TList _list29 = iprot.readListBegin();
              this.list_ref_unique = new ArrayList<Integer>(Math.max(0, _list29.size));
              for (int _i30 = 0; 
                   (_list29.size < 0) ? iprot.peekList() : (_i30 < _list29.size); 
                   ++_i30)
              {
                int _elem31;
                _elem31 = iprot.readI32();
                this.list_ref_unique.add(_elem31);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SET_REF_SHARED:
          if (field.type == TType.SET) {
            {
              TSet _set32 = iprot.readSetBegin();
              this.set_ref_shared = new HashSet<Integer>(Math.max(0, 2*_set32.size));
              for (int _i33 = 0; 
                   (_set32.size < 0) ? iprot.peekSet() : (_i33 < _set32.size); 
                   ++_i33)
              {
                int _elem34;
                _elem34 = iprot.readI32();
                this.set_ref_shared.add(_elem34);
              }
              iprot.readSetEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MAP_REF_CUSTOM:
          if (field.type == TType.MAP) {
            {
              TMap _map35 = iprot.readMapBegin();
              this.map_ref_custom = new HashMap<Integer,Integer>(Math.max(0, 2*_map35.size));
              for (int _i36 = 0; 
                   (_map35.size < 0) ? iprot.peekMap() : (_i36 < _map35.size); 
                   ++_i36)
              {
                int _key37;
                int _val38;
                _key37 = iprot.readI32();
                _val38 = iprot.readI32();
                this.map_ref_custom.put(_key37, _val38);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LIST_REF_SHARED_CONST:
          if (field.type == TType.LIST) {
            {
              TList _list39 = iprot.readListBegin();
              this.list_ref_shared_const = new ArrayList<Integer>(Math.max(0, _list39.size));
              for (int _i40 = 0; 
                   (_list39.size < 0) ? iprot.peekList() : (_i40 < _list39.size); 
                   ++_i40)
              {
                int _elem41;
                _elem41 = iprot.readI32();
                this.list_ref_shared_const.add(_elem41);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SET_CUSTOM_REF:
          if (field.type == TType.SET) {
            {
              TSet _set42 = iprot.readSetBegin();
              this.set_custom_ref = new HashSet<Integer>(Math.max(0, 2*_set42.size));
              for (int _i43 = 0; 
                   (_set42.size < 0) ? iprot.peekSet() : (_i43 < _set42.size); 
                   ++_i43)
              {
                int _elem44;
                _elem44 = iprot.readI32();
                this.set_custom_ref.add(_elem44);
              }
              iprot.readSetEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.list_ref != null) {
      oprot.writeFieldBegin(LIST_REF_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.list_ref.size()));
        for (int _iter45 : this.list_ref)        {
          oprot.writeI32(_iter45);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.set_ref != null) {
      oprot.writeFieldBegin(SET_REF_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.set_ref.size()));
        for (int _iter46 : this.set_ref)        {
          oprot.writeI32(_iter46);
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.map_ref != null) {
      oprot.writeFieldBegin(MAP_REF_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.I32, this.map_ref.size()));
        for (Map.Entry<Integer, Integer> _iter47 : this.map_ref.entrySet())        {
          oprot.writeI32(_iter47.getKey());
          oprot.writeI32(_iter47.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.list_ref_unique != null) {
      oprot.writeFieldBegin(LIST_REF_UNIQUE_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.list_ref_unique.size()));
        for (int _iter48 : this.list_ref_unique)        {
          oprot.writeI32(_iter48);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.set_ref_shared != null) {
      oprot.writeFieldBegin(SET_REF_SHARED_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.set_ref_shared.size()));
        for (int _iter49 : this.set_ref_shared)        {
          oprot.writeI32(_iter49);
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.map_ref_custom != null) {
      oprot.writeFieldBegin(MAP_REF_CUSTOM_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.I32, this.map_ref_custom.size()));
        for (Map.Entry<Integer, Integer> _iter50 : this.map_ref_custom.entrySet())        {
          oprot.writeI32(_iter50.getKey());
          oprot.writeI32(_iter50.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.list_ref_shared_const != null) {
      oprot.writeFieldBegin(LIST_REF_SHARED_CONST_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.list_ref_shared_const.size()));
        for (int _iter51 : this.list_ref_shared_const)        {
          oprot.writeI32(_iter51);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.set_custom_ref != null) {
      oprot.writeFieldBegin(SET_CUSTOM_REF_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.set_custom_ref.size()));
        for (int _iter52 : this.set_custom_ref)        {
          oprot.writeI32(_iter52);
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("StructWithContainers");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("list_ref");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getList_ref() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getList_ref(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("set_ref");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getSet_ref() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getSet_ref(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("map_ref");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getMap_ref() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getMap_ref(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("list_ref_unique");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getList_ref_unique() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getList_ref_unique(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("set_ref_shared");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getSet_ref_shared() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getSet_ref_shared(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("map_ref_custom");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getMap_ref_custom() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getMap_ref_custom(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("list_ref_shared_const");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getList_ref_shared_const() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getList_ref_shared_const(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("set_custom_ref");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getSet_custom_ref() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getSet_custom_ref(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

