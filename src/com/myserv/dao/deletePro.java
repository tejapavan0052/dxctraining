package com.myserv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.myserv.dbutil.DbConnection;

public class deletePro {

	public String deleteProduct(int prod_Id)
	{
		try {
			Connection con= DbConnection.getConnect();
			String sql="delete from products where prod_Id=?";
			PreparedStatement stat=con.prepareStatement(sql);
			stat.setInt(1,prod_Id);
			int res=stat.executeUpdate();
			if(res>0)
				return "done delete";
			else
				return "not done";
		} catch (Exception e) {
			e.printStackTrace();
			return "exception"+e;
		}	
	}
}