package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insertfromscanner {
	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");
			String s= "insert into clg values ('?','?')";
			PreparedStatement p=con.prepareStatement(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter clg id, name,");
			int cId=sc.nextInt();
			String cName=sc.next();
			
			p.setInt(1, cId);
			p.setString(2, cName);
			
			
			p.executeUpdate();
			System.out.println("inserted");
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
	
	
	
	
	}
	
	
	

}
