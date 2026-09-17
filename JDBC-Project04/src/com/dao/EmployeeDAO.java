package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	
	int addEmployee(Employee addEmployee);
	
	int deleteEmployee(Employee deleteEmployee);
	
	int deleteEmployeeById(int id);
	
	int updateEmployee(Employee updateEmployee);
	
	List<Employee>findAllEmployee();
	
	Employee findemployeeById(int id);
}
