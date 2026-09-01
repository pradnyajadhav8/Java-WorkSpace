package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	private final static String URL = "jdbc:mysql://localhost:3306/jap89";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "Pradnya@01";

	public static void main(String[] args)  throws ClassNotFoundException, SQLException{

		int id = 1;
		String name = "Rahul";
		double marks = 66.66;

		// Step 1 TO LOAD DRIVER CLASS
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 2 To CREATE CONNECTION

		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		// Step 3 Create Query

		String sql = "insert into student(id,name,marks) values (?,?,?)";

		// ? place holder
		// Step 4 give Query to prepare statement
		PreparedStatement preparedStatement = con.prepareStatement(sql);

		// step 5 Fill Place Holder
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setDouble(3, marks);

		// step 6: ExecuteUpdate

		int row = preparedStatement.executeUpdate();
		System.out.println(row);
	}
}
