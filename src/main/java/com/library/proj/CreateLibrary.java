package com.library.proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateLibrary {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","1234");
		Statement st=con.createStatement();
		//st.execute("create database library");
		st.execute("create table admin(id int, name varchar(100),email varchar(100),password varchar(100))");
		st.execute("create table book(id int, bookName varchar(100),authName varchar(100), genre varchar(50), price int)");
		System.out.println("table created successfully");

	}

}
