package com.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadEmpData {

	private static final String URL = "jdbc:mysql://localhost:3306/VMTEmp";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Pradnya@01";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		String sql = "select * from Employee";

		PreparedStatement preparedStatement = con.prepareStatement(sql);

		ResultSet rs = preparedStatement.executeQuery();

		System.out.printf("%-5s%-10s%-10s%-15s%-10s \n", "ID", "NAME", "ADDRESS", "PHONE NUMBER", "EMAIL ADDRESS");
		System.out.println("______________________________________________________________________");

		while (rs.next()) {
			System.out.printf("%-5d", rs.getInt("id"));
			System.out.printf("%-10s", rs.getString("name"));
			System.out.printf("%-10s", rs.getString("address"));
			System.out.printf("%-15s", rs.getString("number"));
			System.out.printf("%-10s", rs.getString("email"));
			System.out.println();
		}

		rs.close();
		con.close();

	}

}
