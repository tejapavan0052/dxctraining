package com.spring.spring;

import java.util.Date;

public class Student {

String name;
String studentId;
Address address;
int sem;
String[] plocation;

Date studentDob;




public Date getStudentDob() {
return studentDob;
}
public void setStudentDob(Date studentDob) {
this.studentDob = studentDob;
}
public String[] getPlocation() {
return plocation;
}
public void setPlocation(String[] plocation) {
this.plocation = plocation;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getStudentId() {
return studentId;
}
public void setStudentId(String studentId) {
this.studentId = studentId;
}

public Address getAddress() {
return address;
}
public void setAddress(Address address) {
this.address = address;
}
public int getSem() {
return sem;
}
public void setSem(int sem) {
this.sem = sem;
}
public Student(String name, String studentId, String address, int sem) {
super();
this.name = name;
this.studentId = studentId;
this.sem = sem;
}

public Student() {
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "Student [name=" + name + ", studentId=" + studentId + ", address=" + address + ", sem=" + sem + "]";
}


}