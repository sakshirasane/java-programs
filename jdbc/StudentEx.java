package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class StudentEx {
	Connection connection;
	java.sql.Statement statement;
	ResultSet resultSet;
	PreparedStatement preparedStatement;

	public StudentEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
        System.out.println("Connection get Open");		
	}
	//1.insert Student record
/*	public void insertstudentrecord(int Roll_No,String Name,Date DOB,float percent,String city,String Email_Id,String phone_no) throws SQLException {
		preparedStatement = connection.prepareStatement("insert into Student value(?,?,?,?,?,?,?)");
		preparedStatement.setInt(1,Roll_No );
		preparedStatement.setString(2, Name);
		preparedStatement.setDate(3, DOB);
		preparedStatement.setFloat(4,percent);
		preparedStatement.setString(5, city);
		preparedStatement.setString(6, Email_Id);
		preparedStatement.setString(7, phone_no);
		
		
		int n = preparedStatement.executeUpdate();
		System.out.println(n + "record is inserted");

		}*/
	
	//2.view all  student details 
	/*public void studentdetails() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from Student");
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("Roll_No")+"\t");
			System.out.print(resultSet.getString("Name")+"\t");
			System.out.print(resultSet.getDate("DOB")+"\t");
			System.out.print(resultSet.getFloat("percent")+"\t");
			System.out.print(resultSet.getString("city")+"\t");
			System.out.print(resultSet.getString("Email_Id")+"\t");
			System.out.print(resultSet.getString("phone_no")+"\t");
		    System.out.println();
		}
			
	}*/

	//3.view Student by city name
	/*public void studentbycity(String city) throws SQLException {
		preparedStatement = connection.prepareStatement("select * from Student where city= ?");
		
		preparedStatement.setString(1, city);	
		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("Roll_No")+"\t");
			System.out.print(resultSet.getString("Name")+"\t");
			System.out.print(resultSet.getDate("DOB")+"\t");
			System.out.print(resultSet.getFloat("percent")+"\t");
			System.out.print(resultSet.getString("city")+"\t");
			System.out.print(resultSet.getString("Email_Id")+"\t");
			System.out.print(resultSet.getString("phone_no")+"\t");
		    System.out.println();
		
			
		}
	}*/
	
	//4.update student details by rollno
	public void updatestudentbyrollnumber(int Roll_No) throws SQLException {
		preparedStatement = connection.prepareStatement("update Student set city='mumbai'where id in= ?");
		preparedStatement.setInt(1, Roll_No);	

		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {

		System.out.print(resultSet.getInt("Roll_No")+"\t");
		System.out.print(resultSet.getString("Name")+"\t");
		System.out.print(resultSet.getDate("DOB")+"\t");
		System.out.print(resultSet.getFloat("percent")+"\t");
		System.out.print(resultSet.getString("city")+"\t");
		System.out.print(resultSet.getString("Email_Id")+"\t");
		System.out.print(resultSet.getString("phone_no")+"\t");
	    System.out.println();

		}
		
		


	}
	
	
	
	
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		StudentEx obj = new StudentEx();
		//obj.insertstudentrecord(106, "Shubhangi",new Date(6-12-2000), 85,"Mumbai", "Shubhangi@gmail.com","9874566998");
        //obj.studentdetails();	
		//System.out.println("Enter Student city");
		//Scanner sc= new Scanner(System.in);
		//String c= sc.nextLine();
		//obj.studentbycity(c);
		System.out.println("Enter Student Roll_No: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		obj.updatestudentbyrollnumber(n);

		
	
	}
}
