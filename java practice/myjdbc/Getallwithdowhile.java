package myjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Getallwithdowhile {
	public static void main(String[] args) {

		try
		{

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");

		String sql="select * from clg";

		PreparedStatement stat=con.prepareStatement(sql);

		ResultSet rs=stat.executeQuery();
		if(rs.next()){
			do{
			System.out.println(rs.getInt("cid") + " "+rs.getString("cname"));
			}
			while(rs.next());
			}

			else
			System.out.println("No recs Found");
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		}

		}

