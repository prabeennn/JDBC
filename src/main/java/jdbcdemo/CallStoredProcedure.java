package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallStoredProcedure {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Connection con=Helper.getC();
		CallableStatement cs=con.prepareCall("{call m1}");
		cs.execute();
		System.out.println("procedure executed successfully");
	}

}
