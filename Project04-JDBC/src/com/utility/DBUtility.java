package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {

	private final static String URL = "jdbc:mysql://localhost:3306/jap89_db01";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "Pradnya@01";

	private static DBUtility instance = null;

	static {// early binding
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// Logger
			e.printStackTrace();
		}
	}

	private DBUtility() {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			//Logger
//			e.printStackTrace();
//		}
	}

	public static DBUtility getInstance() {
		if (instance != null)
			return instance;
		else
			instance = new DBUtility();
		return instance;
	}

	public Connection getDBConnection() {
		Connection con = null;
		try {

			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.print(e);
		}
		return con;
	}

}