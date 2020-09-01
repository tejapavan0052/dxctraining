package com.product.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.product.dbutil.DBConnection;
import com.product.model.products;



public class productsdao {
	public String createproducts(products product){
		try 
		{
		Connection connection=DBConnection.getConnect();

		String sql="insert into product values(?,?,?,?)";
		PreparedStatement stat=connection.prepareStatement(sql);

		stat.setInt(1,product.getP_num());
		stat.setInt(2,product.getP_code());
		stat.setString(3,product.getP_name());
		stat.setString(4,product.getP_status());
		


		int res= stat.executeUpdate();
		if(res>0)
		return "products Created";
		else
		return "products connot be Created";
		}
		catch (Exception e) {
		e.printStackTrace();
		return "Exception "+e;
		}


		}

		}


