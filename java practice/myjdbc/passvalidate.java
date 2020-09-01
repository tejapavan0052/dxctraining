package myjdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class passvalidate {
	public static void main(String[] args) {

		try
		{

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");

		String sql="select * from regusers where uname=? and password=?";
		PreparedStatement stat=con.prepareStatement(sql);

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your user name and password");

		String uname=sc.next();
		String pass=sc.next();

		stat.setString(1, uname);
		stat.setString(2, pass);


		ResultSet rs=stat.executeQuery();

		if(rs.next()){
		System.out.println("Welcome to Java World");
		}

		else
		System.out.println("Invalid user or password");


		}
		catch (Exception e) {
		e.printStackTrace();
		}
	

	}
}
