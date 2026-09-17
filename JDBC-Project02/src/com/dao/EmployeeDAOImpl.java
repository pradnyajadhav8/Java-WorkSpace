package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
import com.utility.DBUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public int addEmployee(Employee addEmployee) {
		String str = "insert into employee(id,name,address,email,number) values (?,?,?,?,?)";
		Connection con = DBUtility.getDBConnection();
		try {
			PreparedStatement ps = con.prepareStatement(str);
			ps.setInt(1, addEmployee.getId());
			ps.setString(2, addEmployee.getName());
			ps.setString(3, addEmployee.getAddress());
			ps.setString(4, addEmployee.getEmail());
			ps.setString(5, addEmployee.getNumber());

			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteEmployee(Employee employee) {
		return deleteEmployee(employee.getId());
	}

	@Override
	public int deleteEmployee(int id) {
		String str = "delete from employee where id=?";
		Connection con = DBUtility.getDBConnection();

		try {
			PreparedStatement ps = con.prepareStatement(str);
			ps.setInt(1, id);

			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateEmployee(Employee employee) {
		String str = "update into employee set name=?,addresss=?,Email=?,Number=? where id=?";
		Connection con = DBUtility.getDBConnection();

		try {
			PreparedStatement ps = con.prepareStatement(str);
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getAddress());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getNumber());

			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Employee findEmployeeById(int id) {
		String str = "select * from employee where id=?";
		Employee emp = null;

		Connection con = DBUtility.getDBConnection();
		try {
			PreparedStatement ps = con.prepareStatement(str);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setEmail(rs.getString("email"));
				emp.setNumber(rs.getString("number"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Employee> findAllEmplyee() {
		List<Employee>list = new ArrayList<>();
		String str = "select * from employee";
		Connection con = DBUtility.getDBConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement(str);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setEmail(rs.getString("email"));
				emp.setNumber(rs.getString("number"));
				list.add(emp);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;  
	}

}
