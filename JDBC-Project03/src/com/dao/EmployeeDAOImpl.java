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
	public int addEmployee(Employee addemployee) {
		String str = "insert into Employee (id,name,address,number,email)values(?,?,?,?,?)";

		try (Connection con = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = con.prepareStatement(str);) {

			ps.setInt(1, addemployee.getId());
			ps.setString(2, addemployee.getName());
			ps.setString(3, addemployee.getAddress());
			ps.setString(4, addemployee.getNumber());
			ps.setString(5, addemployee.getEmail());

			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return 0;
	}

	@Override
	public int deleteEmployee(Employee deleteEmployee) {
		return deleteEmployeeById(deleteEmployee.getId());
	}

	@Override
	public int deleteEmployeeById(int id) {
		String str = "delete from employee where id=?";

		try (Connection con = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = con.prepareStatement(str);) {

			ps.setInt(1, id);

			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateEmployee(Employee updateEmployee) {
		String str = "UPDATE EMPLOYEE SET name=? ,address=? ,number=? ,email=? WHERE id=?";

		try (Connection con = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = con.prepareStatement(str);) {

			ps.setString(1, updateEmployee.getName());
			ps.setString(2, updateEmployee.getAddress());
			ps.setString(3, updateEmployee.getNumber());
			ps.setString(4, updateEmployee.getEmail());
			ps.setInt(5, updateEmployee.getId());

			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Employee> showAllEmployee() {
		List<Employee> list = new ArrayList<Employee>();
		String str = "select * from employee";
		Connection con = DBUtility.getInstance().getDBConnection();

		try (PreparedStatement ps = con.prepareStatement(str); ResultSet rs = ps.executeQuery();) {

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setNumber(rs.getString("number"));
				emp.setEmail(rs.getString("email"));

				list.add(emp);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Employee findEmployeeById(int id) {
		String str = "select * from employee where id=?";
		Employee emp = null;

		try (Connection con = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = con.prepareStatement(str);) {
			
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				emp = new Employee();
				emp.setName(rs.getString("name"));
				emp.setAddress(rs.getString("address"));
				emp.setNumber(rs.getString("number"));
				emp.setEmail(rs.getString("email"));
			}
			return emp;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

}
