package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter email");
		String email=scn.next();
		
		System.out.println("Enter password");
		String password=scn.next();
		
		Connection con=Helper.getC();
		PreparedStatement ps= con.prepareStatement("select * from user where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		
		if(rs.isBeforeFirst()) {
			System.out.println("Welcome");
		}
		else {
			System.out.println("Invalid Credentials");
		}
		
	}

}
