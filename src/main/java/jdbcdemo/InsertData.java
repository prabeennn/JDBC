package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/University" ,"root","1234");
		Statement st= con.createStatement();
		//st.execute("insert into Student(id,name,age) values(1,'A',25)");
		st.execute("insert into Student(id,name,age) values(1,'Prabeen',25)");
		st.execute("insert into Student(id,name,age) values(3,'Subhasish',25)");
		//st.execute("insert into Student(id,name,age) values(2,'Virat',36)");
		System.out.println("Success");
	}

}
