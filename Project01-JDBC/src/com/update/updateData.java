package com.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateData {
	private static final String URL = "jdbc:mysql://localhost:3306/jap89";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Pradnya@01";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int id = 1;
		String name = "Rekha";
		double marks = 77.33;

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		String sql = "UPDATE student SET name=? , marks=? WHERE id=?";

		PreparedStatement preparedStatement = con.prepareStatement(sql);

		preparedStatement.setInt(3, id);
		preparedStatement.setString(1, name);
		preparedStatement.setDouble(2, marks);

		int row = preparedStatement.executeUpdate();
		System.out.println(row);
	}
}
