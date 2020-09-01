package player;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;

public class Player {

String playerId;
String fname;
String lname;
Date dob;
public String getPlayerId() {
return playerId;
}
public void setPlayerId(String playerId) {
this.playerId = playerId;
}
public String getFname() {
return fname;
}
public void setFname(String fname) {
this.fname = fname;
}
public String getLname() {
return lname;
}
public void setLname(String lname) {
this.lname = lname;
}
public Date getDob() {
return dob;
}
public void setDob(Date dob) {
this.dob = dob;
}
public Player(String playerId, String fname, String lname, Date dob) {
super();
this.playerId = playerId;
this.fname = fname;
this.lname = lname;
this.dob = dob;
}


public Player() {
// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "Player [playerId=" + playerId + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + "]";
}
}