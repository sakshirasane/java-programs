package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	static Connection connection;
	public static Connection getMyConnection()  throws ClassNotFoundException,
    SQLException{
		if(connection == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/batch11285","root","password"	);
			return connection;
		
		}
		
				else {
			return connection;
		}
		
	}
	
	
	
}
