package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {

	int registerEmployee(Employee employee);
	
	int removeEmployee(int id);
	
	int modifyEmployee(Employee employee);
	
	List<Employee>getAllEmployee();
	
	Employee getEmployeeById(int id);
}
