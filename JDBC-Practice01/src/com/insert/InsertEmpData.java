package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmpData {

	private final static String URL = "jdbc:mysql://localhost:3306/VMTEmp";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "Pradnya@01";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int id = 1;
		String name = "Ram";
		String address = "Pune";
		String number = "8765432101";
		String email = "ram@gmail.com";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		String sql = "insert into employee(id,name,address,number,email) values(?,?,?,?,?)";

		PreparedStatement preparedStatement = con.prepareStatement(sql);

		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, address);
		preparedStatement.setString(4, number);
		preparedStatement.setString(5, email);

		int row = preparedStatement.executeUpdate();
		System.out.print(row);
	}

}
