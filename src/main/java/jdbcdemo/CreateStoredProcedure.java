package jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStoredProcedure {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/University","root","1234");
		Statement st=con.createStatement();
		st.execute("CREATE PROCEDURE `m1`() "
		        + "BEGIN "
		        + "INSERT INTO user(id, name, email, password) VALUES(2, 'virat', 'virat18@gmail.com', 'predator'); "
		        + "INSERT INTO user(id, name, email, password) VALUES(3, 'sourav', 'sourav18@gmail.com', 'predator'); "
		        + "INSERT INTO user(id, name, email, password) VALUES(4, 'abakas', 'abakas18@gmail.com', 'predator'); "
		        + "UPDATE user SET name='jaysree' WHERE id=2; "
		        + "END;");

		System.out.println("Stored procedure created successfully");
	}

}
