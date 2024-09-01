package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateUserTable {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/University","root","1234");
		Statement st = con.createStatement();	
       // st.execute("create database university");
        st.execute("create table user(id int,name varchar(100),email varchar(100),password varchar(100))");
        System.out.println("table created successfully");
	}

}
