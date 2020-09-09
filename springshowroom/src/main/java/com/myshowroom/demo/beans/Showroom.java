package com.myshowroom.demo.beans;

import java.util.ArrayList;

public class Showroom {

String name;
ArrayList<Car> cars;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public ArrayList<Car> getCars() {
return cars;
}
public void setCars(ArrayList<Car> cars) {
this.cars = cars;
}
public Showroom(String name, ArrayList<Car> cars) {
super();
this.name = name;
this.cars = cars;
}
@Override
public String toString() {
return "Showroom [name=" + name + ", cars=" + cars + "]";
}



}

