package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {

	private static final String URL = "jdbc:mysql://localhost:3306/VMTEmp";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "Pradnya@01";

	private DBUtility() {
	}

	public static Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return con;
	}

}
