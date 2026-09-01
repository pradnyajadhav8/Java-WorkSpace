package com.dao;

//import java.util.List;

import com.basic.Employee;

public interface EmployeeDao {//

	boolean addEmployee(Employee employee);

	boolean removeEmployee(Employee employee);

	boolean isEmployeePresent(Employee employee);

	boolean updateEmployee(int id, Employee employee);

	int totalEmployees();

	void printEmployee(Employee employee);

}
