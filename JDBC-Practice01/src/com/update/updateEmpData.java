package com.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateEmpData {

	private final static String URL="jdbc:mysql://localhost:3306/vmtemp";
	private final static String USERNAME="root";
	private final static String PASSWORD="Pradnya@01";
	
	public static void main(String[] args) throws ClassNotFoundException ,SQLException{
		
		int id = 1;
		String name = "shyam";
		String address = "/mumabi";
		String number = "9900432101";
		String email = "shyam@gmail.com";
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
		String sql="UPDATE employee SET name=? ,address=? ,number=? ,email=? WHERE id=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(5, id);
		ps.setString(1, name);
		ps.setString(2, address);
		ps.setString(3, number);
		ps.setString(4, email);
		
		int row=ps.executeUpdate();
		System.out.println("Row Affested: "+row);
	}
}
