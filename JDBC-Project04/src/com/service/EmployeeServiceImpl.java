package com.service;

import java.util.List;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;
import com.exception.EmployeeServiceException;
import com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO=new EmployeeDAOImpl();
	
	@Override
	public int registerEmployee(Employee employee) {
		if(employee!=null) {
			return employeeDAO.addEmployee(employee);
		}else {
			try {
				throw new EmployeeServiceException("Employee Can't be Null...!");
			}catch (Exception e) {
				
			}
		}
		return 0;
	}

	@Override
	public int removeEmployee(int id) {
		if(id<1) {
			throw new EmployeeServiceException("ID must be greater than 1");
		}
		return employeeDAO.deleteEmployeeById(id);
	}

	@Override
	public int modifyEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDAO.findAllEmployee();
	}

	@Override
	public Employee getEmployeeById( int id ) {
		if(id<1)
			throw new EmployeeServiceException("ID must be greater than 1");
		return  employeeDAO.findemployeeById(id);
	}

}
