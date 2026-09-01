package com.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteData {
	
	private static final String URL="jdbc:mysql://localhost:3306/jap89";
	private static final String USERNAME="root";
	private static final String PASSWORD="Pradnya@01";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		int id=1;
		//step 1: Load Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2: Create Connection
		Connection con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
		//step 3: Create Delete Query
		String sql="DELETE FROM student WHERE id=?";
		
		//step 4: Give Query to PreparedStatement
		PreparedStatement preparedStatement=con.prepareStatement(sql);
		
		//step 5: fill placeholder
		preparedStatement.setInt(1, id);
		
		//Step 6: execute Update
		int row = preparedStatement.executeUpdate();
		
		System.out.println(row +"row deleted");
		
	}
}
