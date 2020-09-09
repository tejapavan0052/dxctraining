package com.myspr.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {

@Id
int authorId;
String authorName;

public Author() {
// TODO Auto-generated constructor stub
}

@Override
public String toString() {
return "Author [authorId=" + authorId + ", authorName=" + authorName + ", city=" + city + "]";
}

public Author(int authorId, String authorName, String city) {
super();
this.authorId = authorId;
this.authorName = authorName;
this.city = city;
}
public int getAuthorId() {
return authorId;
}
public void setAuthorId(int authorId) {
this.authorId = authorId;
}
public String getAuthorName() {
return authorName;
}
public void setAuthorName(String authorName) {
this.authorName = authorName;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
String city;




}

