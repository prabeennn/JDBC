package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateFacultyDataDynamically {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter id to update");
		int id=scn.nextInt();
		
		System.out.println("enter new name");
		String name=scn.next();
		
		System.out.println("enter updated age");
		int age=scn.nextInt();
		
		System.out.println("enter updated salary");
		double salary=scn.nextDouble();
        
		Connection con=Helper.getC();
		PreparedStatement ps=con.prepareStatement("update faculty set name=?,age=?,salary=? where id=?");
		ps.setString(1, name);
		ps.setInt(2, age);
		ps.setDouble(3, salary);
		ps.setInt(4, id);
		int rowsAffected=ps.executeUpdate();
		System.out.println("Data Update Successfully");
		System.out.println("no of rows affected="+rowsAffected);

	}

}
