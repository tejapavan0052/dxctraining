package com.product.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myschool.dbutil.DBConnection;

public class displaydata {
	public void displaydata()
	{
	try
	{
	Connection connection=DBConnection.getConnect();
	String sql="select * from product";
	PreparedStatement stat=connection.prepareStatement(sql);;

	ResultSet rs=stat.executeQuery();
	System.out.println("displaying all");


	if(rs.next()){
	do{
	System.out.println(rs.getInt("p_num") + " "+rs.getInt("p_code") + " "rs.getString("p_name")+" "+rs.getString("P_status"));
	}
	while(rs.next());
	}

	else
	System.out.println("No recs Found");
	}

	      catch (Exception e) {

	     e.printStackTrace();;

	}
	}
}
