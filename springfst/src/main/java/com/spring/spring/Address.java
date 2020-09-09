package com.spring.spring;

public class Address {

String city;
String state;
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}
public String getState() {
return state;
}
public void setState(String state) {
this.state = state;
}
public Address(String city, String state) {
super();
this.city = city;
this.state = state;
}
public Address() {
// TODO Auto-generated constructor stub
}


@Override
public String toString() {
return "Address [city=" + city + ", state=" + state + "]";
}



}

