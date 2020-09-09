package com.myboot.bootapi;

public class Student {

int studentId;
String studentName;
public int getStudentId() {
return studentId;
}
public void setStudentId(int studentId) {
this.studentId = studentId;
}
public String getStudentName() {
return studentName;
}
public void setStudentName(String studentName) {
this.studentName = studentName;
}
public Student(int studentId, String studentName) {
super();
this.studentId = studentId;
this.studentName = studentName;
}
@Override
public String toString() {
return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
}
public Student() {
// TODO Auto-generated constructor stub
}
}
