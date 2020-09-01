package com.myserv.model;

import java.util.Date;

public class Product {

int prodId;
String prodName;
float prodPrice;
Date mfd;
String colour;
Date expDate;
public int getProdId() {
return prodId;
}
public void setProdId(int prodId) {
this.prodId = prodId;
}
public String getProdName() {
return prodName;
}
public void setProdName(String prodName) {
this.prodName = prodName;
}
public float getProdPrice() {
return prodPrice;
}
public void setProdPrice(float prodPrice) {
this.prodPrice = prodPrice;
}
public Date getMfd() {
return mfd;
}
public void setMfd(Date mfd) {
this.mfd = mfd;
}
public String getColour() {
return colour;
}
public void setColour(String colour) {
this.colour = colour;
}
public Date getExpDate() {
return expDate;
}
public void setExpDate(Date expDate) {
this.expDate = expDate;
}
public Product(int prodId, String prodName, float prodPrice, Date mfd, String colour, Date expDate) {
super();
this.prodId = prodId;
this.prodName = prodName;
this.prodPrice = prodPrice;
this.mfd = mfd;
this.colour = colour;
this.expDate = expDate;
}


public Product() {
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", mfd=" + mfd
+ ", colour=" + colour + ", expDate=" + expDate + "]";
}



}

