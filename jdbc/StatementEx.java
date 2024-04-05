package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StatementEx {

	Connection connection;
	java.sql.Statement statement;
	ResultSet resultSet;
	
	public StatementEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
        System.out.println("Connection get Open");		
	}
	public void getCustomers() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from Customer");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("custId")+"\t");
			System.out.println(resultSet.getString("custname")+"\t");
			System.out.println(resultSet.getString("custAddress")+"\t");
			System.out.println(resultSet.getString("phone_No")+"\t");
		    System.out.println();
		}
			
		
	}
	public void close() throws SQLException {
		connection.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StatementEx obj = new StatementEx();
		obj.getCustomers();
		obj.close();
	}
	
	
}
