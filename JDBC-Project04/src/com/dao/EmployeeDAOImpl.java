package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.utility.DBUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public int addEmployee(Employee addEmployee) {
		String str = "insert into employee(id,name,address,number,email) values (?,?,?,?,?)";
		Connection con=DBUtility.getInstance().getConnection();
		try {
			PreparedStatement ps=con.prepareStatement(str);
			ps.setInt(1, addEmployee.getId());
			ps.setString(2, addEmployee.getName());
			ps.setString(3, addEmployee.getAddress());
			ps.setString(4, addEmployee.getNumber());
			ps.setString(5, addEmployee.getEmail());
			
			return ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return 0;
	}

	@Override
	public int deleteEmployee(Employee deleteEmp) {
		return deleteEmployeeById(deleteEmp.getId());
	}

	@Override
	public int deleteEmployeeById(int id) {
		String str="delete into employee where id=?";
		Connection con=DBUtility.getInstance().getConnection();
		try {
			PreparedStatement ps=con.prepareStatement(str);
			ps.setInt(1, id);
			
			return ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return 0;
	}

	@Override
	public int updateEmployee(Employee updateEmployee) {
		String str="update employee set name=?,address=?,number=?,email=? where id=?";
		
		try (Connection con=DBUtility.getInstance().getConnection();PreparedStatement ps=con.prepareStatement(str);){
			
			ps.setString(1, updateEmployee.getName());
			ps.setString(2, updateEmployee.getAddress());
			ps.setString(3, updateEmployee.getNumber());
			ps.setString(4, updateEmployee.getEmail());
			ps.setInt(5, updateEmployee.getId());
			
			return ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return 0;
	}

	@Override
	public List<Employee> findAllEmployee() {
		String str="select * from employee";
		List<Employee>list=new ArrayList<Employee>();
		try (Connection con=DBUtility.getInstance().getConnection();PreparedStatement ps=con.prepareStatement(str); ResultSet rs= ps.executeQuery();){
			Employee employee=null;
			
			while(rs.next()) {
				employee=new Employee();
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setAddress(rs.getString("address"));
				employee.setNumber(rs.getString("number"));
				employee.setEmail(rs.getString("email"));
				list.add(employee);
			}
			return list;
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return list;
	}

	@Override
	public Employee findemployeeById(int id) {
		String str="select * from employee where id=?";
		List<Employee>list=new ArrayList<Employee>();
		Employee employee=null;
		
		try (Connection con=DBUtility.getInstance().getConnection();PreparedStatement ps=con.prepareStatement(str); ResultSet rs= ps.executeQuery();){
			
			if(rs.next()) {
				employee=new Employee();
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setAddress(rs.getString("address"));
				employee.setNumber(rs.getString("number"));
				employee.setEmail(rs.getString("email"));
			}
			return employee;
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return employee;
	}

}
