package com.myserv.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

public static Connection getConnect()
{
try
{

Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs", "pass");

return con;
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return null;
}

}
