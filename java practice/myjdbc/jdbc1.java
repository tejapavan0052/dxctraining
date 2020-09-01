package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc1 {

public static void main(String[] args) {

try
{
// external class
Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");
String s= "insert into clg values ('1298','jhy')";
PreparedStatement p=con.prepareStatement(s);
p.executeUpdate();
System.out.println("inserted");
}
catch (Exception e) {
e.printStackTrace();
}
}

}