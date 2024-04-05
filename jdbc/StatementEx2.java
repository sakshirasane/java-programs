package jdbc;


	import java.sql.Connection;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class StatementEx2 {

		Connection connection;
		java.sql.Statement statement;
		ResultSet resultSet;
		
		public StatementEx2() throws ClassNotFoundException, SQLException {
			connection = MyConnection.getMyConnection();
	        System.out.println("Connection get Open");		
		}
		public void getId(int id) throws SQLException {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from Customer where custId= "+id);
			while(resultSet.next()) {
				System.out.print(resultSet.getInt("custId")+"\t");
				System.out.print(resultSet.getString("custname")+"\t");
				System.out.print(resultSet.getString("custAddress")+"\t");
				System.out.print(resultSet.getString("phone_No")+"\t");
			    System.out.println();
			}
				
			
		}
		public void close() throws SQLException {
			connection.close();
		}
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			StatementEx2 obj = new StatementEx2();
			obj.getId(101);
			obj.close();
		}
		
		
	}


