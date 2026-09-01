package com.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class readData {

	private static final String URL = "jdbc:mysql://localhost:3306/jap89";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Pradnya@01";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		String sql = "SELECT * FROM student";

		PreparedStatement preparedStatement = con.prepareStatement(sql);

		ResultSet rs= preparedStatement.executeQuery();
		
		System.out.printf("%-5s%-10s%-2s \n","ID","NAME","MARKS");
		System.out.println("________________________________");
		
		while(rs.next()) {
			System.out.printf("%-5d",rs.getInt("id"));
			System.out.printf("%-10s",rs.getString("name"));
			System.out.printf("%-2.2f",rs.getDouble("marks"));
			System.out.println();
		}
		
		rs.close();
		con.close();
	}
}
