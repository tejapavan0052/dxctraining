package com.myschool.model;

public class College {

private int cId;
private String cName;
public int getcId() {
return cId;
}
public void setcId(int cId) {
this.cId = cId;
}
public String getcName() {
return cName;
}
public void setcName(String cName) {
this.cName = cName;
}
public College(int cId, String cName) {
super();
this.cId = cId;
this.cName = cName;
}

public College() {
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "College [cId=" + cId + ", cName=" + cName + "]";
}



}
