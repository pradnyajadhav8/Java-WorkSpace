package com.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteEmpData {

	private final static String URL="jdbc:mysql://localhost:3306/VMTEmp";
	private final static String USERNAME="root";
	private final static String PASSWORD="Pradnya@01";
	
	public static void main(String arg[]) throws ClassNotFoundException , SQLException{
		
		int id=1;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
		String sql="delete from employee where id=?";
		
		PreparedStatement ps= con.prepareStatement(sql);
		
		ps.setInt(1, id);
		
		int row=ps.executeUpdate();
		
		System.out.println("Row Affected :"+row);
	}
	
}
