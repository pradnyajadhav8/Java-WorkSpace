package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {

	int addEmployee(Employee employee);
	
	int deleteEmployee(Employee employee);
	
	int deleteEmployee(int id);
	
	List<Employee>findAllEmplyee();
	
	int updateEmployee(Employee employee);
	
	Employee findEmployeeById(int id);

}
