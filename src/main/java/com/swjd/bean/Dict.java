package com.swjd.bean;


public class Dict {

  private int dictId;
  private String dictType;
  private String dictTypeName;
  private String dictItemCode;
  private String dictItemName;
  private String dictSort;
  private String dictFlag;
  private String remark;


  public long getDictId() {
    return dictId;
  }

  public void setDictId(int dictId) {
    this.dictId = dictId;
  }


  public String getDictType() {
    return dictType;
  }

  public void setDictType(String dictType) {
    this.dictType = dictType;
  }


  public String getDictTypeName() {
    return dictTypeName;
  }

  public void setDictTypeName(String dictTypeName) {
    this.dictTypeName = dictTypeName;
  }


  public String getDictItemCode() {
    return dictItemCode;
  }

  public void setDictItemCode(String dictItemCode) {
    this.dictItemCode = dictItemCode;
  }


  public String getDictItemName() {
    return dictItemName;
  }

  public void setDictItemName(String dictItemName) {
    this.dictItemName = dictItemName;
  }


  public String getDictSort() {
    return dictSort;
  }

  public void setDictSort(String dictSort) {
    this.dictSort = dictSort;
  }


  public String getDictFlag() {
    return dictFlag;
  }

  public void setDictFlag(String dictFlag) {
    this.dictFlag = dictFlag;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Dict() {
  }

  public Dict(String dictType, String dictTypeName, String dictItemCode, String dictItemName, String dictSort, String dictFlag, String remark) {
    this.dictType = dictType;
    this.dictTypeName = dictTypeName;
    this.dictItemCode = dictItemCode;
    this.dictItemName = dictItemName;
    this.dictSort = dictSort;
    this.dictFlag = dictFlag;
    this.remark = remark;
  }

  @Override
  public String toString() {
    return "Dict{" +
            "dictId=" + dictId +
            ", dictType='" + dictType + '\'' +
            ", dictTypeName='" + dictTypeName + '\'' +
            ", dictItemCode='" + dictItemCode + '\'' +
            ", dictItemName='" + dictItemName + '\'' +
            ", dictSort='" + dictSort + '\'' +
            ", dictFlag='" + dictFlag + '\'' +
            ", remark='" + remark + '\'' +
            '}';
  }
}
