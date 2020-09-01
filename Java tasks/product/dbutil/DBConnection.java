package com.product.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

public static Connection getConnect(){
try{
Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");
return con;
}
catch (Exception e) {
e.printStackTrace();
return null;
}
}

}
