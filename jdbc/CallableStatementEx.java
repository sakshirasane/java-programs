package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementEx {
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	CallableStatement cstmt;
 
	public CallableStatementEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("connection get open");

	}
	public void callingProcedure(int custId,String custName,String custAddress,String phone_No) throws SQLException {
		cstmt = connection.prepareCall("{call insertCustomer(?,?,?,?)}");
		//cstmt.prepareCall("{call insertCustomer(?,?,?,?)}");
		cstmt.setInt(1,custId);
		cstmt.setString(2,custName);
		cstmt.setString(3,custAddress);
		cstmt.setString(4,phone_No);
		
		cstmt.execute();
	System.out.println("value is inserted");
	}
	public void close() throws SQLException {
		connection.close();
	}
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		CallableStatementEx obj = new CallableStatementEx();
		obj.callingProcedure(401, "simran", "pune", "9846412365");
		obj.close();
		
	}
}
