package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatementWithBatchProcessing {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/University" ,"root","1234");
		PreparedStatement ps=con.prepareStatement("insert into student(id,name,age) values(?,?,?)");
		Scanner scn=new Scanner(System.in);
		
		
		for(int i=0;i<2;i++) {
			System.out.println("Enter id: ");
			int id=scn.nextInt();
			
			System.out.println("Enter name: ");
			String name=scn.next();
			
			System.out.println("Enter age");
			int age=scn.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			
			ps.addBatch();
		}
		ps.executeBatch();
		System.out.println("Batch executed Successfully");

	}

}
