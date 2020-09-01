package com.product.deletion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.product.dbutil.DBConnection;
import com.product.model.products;



public class proud {
	public String createproducts(products product){
		try 
		{
		Connection connection=DBConnection.getConnect();

		String sql="delete from clg where p_num=?";
		PreparedStatement stat=connection.prepareStatement(sql);

		stat.setInt(1,product.getP_num());

		int res= stat.executeUpdate();
		if(res>0)
		return "products deleted";
		else
		return "products not deleted";

		}
		catch (Exception e) {
		e.printStackTrace();
		return "Exception "+e;
		}


		}

	public char[] deleteproductsByP_num(int i) {
		// TODO Auto-generated method stub
		return null;
	}

		}


