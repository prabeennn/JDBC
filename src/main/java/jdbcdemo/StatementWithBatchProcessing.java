package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class StatementWithBatchProcessing {

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/University" ,"root","1234");
		Statement st= con.createStatement();
		st.addBatch("insert into student(id,name,age) values(15,'abid',23)");
		st.addBatch("insert into student(id,name,age) values(4,'abakas',24)");
		st.addBatch("update student set age=25 where id=3");
		st.addBatch("delete from student where name='sourav'");
		st.addBatch("delete from student where id=4");
		
		
		int[] a= st.executeBatch();
		Arrays.stream(a).forEach(System.out::println);
		
		//st.executeBatch();
		System.out.println("Batch executed successfully");
		
	}

}
