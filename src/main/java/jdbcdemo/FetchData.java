package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/University" ,"root","1234");
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("select * from student where id=1");
		rs.next();
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getInt(3));
		ResultSet rs1= st.executeQuery("select * from student where id=2");
		rs1.next();
		System.out.println(rs1.getInt("id"));
		System.out.println(rs1.getString("name"));
		System.out.println(rs1.getInt("age"));
		
	}

}
