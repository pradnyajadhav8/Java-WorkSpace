package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.model.Employee;
import com.utility.DBUtility;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public int addEmployee(Employee addemployee) {
		String str="insert into Employee (id,name,address,number,email)values(?,?,?,?,?)";
		
		try (Connection con= DBUtility.getInstance().getDBConnection();PreparedStatement ps=con.prepareStatement(str);){
			
			ps.setInt(1, addemployee.getId());
			ps.setString(2, addemployee.getName());
			ps.setString(3, addemployee.getAddress());
			ps.setString(4, addemployee.getNumber());
			ps.setString(5,addemployee.getEmail());
			
			ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return 0;
	}

	@Override
	public int deleteEmployee(Employee deleteEmployee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmployee(Employee updateEmployee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
