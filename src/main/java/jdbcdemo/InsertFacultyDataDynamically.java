package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertFacultyDataDynamically {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter id: ");
		int id=scn.nextInt();
		
		System.out.println("enter name: ");
		String name=scn.next();
		
		System.out.println("enter age: ");
		int age=scn.nextInt();
		
		System.out.println("enter salary: ");
		double salary=scn.nextDouble();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/U1niversity","root","1234");
		PreparedStatement ps=con.prepareStatement("insert into faculty(id,name,age,salary) values(?,?,?,?)");
        
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setInt(3, age);
		ps.setDouble(4,salary);
		
		ps.execute();
		System.out.println("Data inserted Successfully");


	}

}
