package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchDataUsingExecute {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Connection con=Helper.getC();
		Statement st= con.createStatement();
		st.execute("select * from student where id=5");
		
		ResultSet rs=st.getResultSet();
		if(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}

	}

}
