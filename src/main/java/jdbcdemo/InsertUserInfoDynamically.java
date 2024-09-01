package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUserInfoDynamically {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Id");
		int id=scn.nextInt();
		
		System.out.println("Enter Name: ");
		String name=scn.next();
		
		System.out.println("Enter email: ");
		String email=scn.next();
		
		System.out.println("Enter Password");
		String password=scn.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=Helper.getC();  //check helper class
		Statement st=con.createStatement();
		PreparedStatement ps=con.prepareStatement("insert into user(id,name,email,password)values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, password);
		
		ps.execute();
		System.out.println("Data Inseretd Successfully");
	}

}
