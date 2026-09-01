package com.dao;

import java.util.ArrayList;

import com.basic.Employee;

public class EmployeeDaoImp1 implements EmployeeDao {
	private ArrayList<Employee> empList = new ArrayList<Employee>();

	@Override
	public boolean addEmployee(Employee employee) {
		return empList.add(employee);
	}

	@Override
	public boolean removeEmployee(Employee employee) {
		return empList.remove(employee);
	}

	@Override
	public boolean isEmployeePresent(Employee employee) {

		return empList.contains(employee);
	}

	@Override
	public boolean updateEmployee(int id, Employee updateemployee) {
		Employee employee = findById(id);
		if (employee != null) {
			employee.setId(updateemployee.getId());
			employee.setName(updateemployee.getName());
			employee.setAge(updateemployee.getAge());
			employee.setSalary(updateemployee.getSalary());
			return true;
		}

		return false;
	}

	@Override
	public int totalEmployees() {
		return empList.size();
	}

	@Override
	public void printEmployee(Employee employee) {

		System.out.println("-------------------------");
		System.out.println("  ID     NAME      AGE      SALARY  ");
		System.out.printf("%3d", employee.getId());
		System.out.printf("%10s", employee.getName());
		System.out.printf("%3d", employee.getAge());
		System.out.printf("%5.3f", employee.getSalary());
		System.out.println();

	}

	private Employee findById(int id) {

		for (Employee employee : empList) {
			if (employee.getId() == id)
				return employee;
		}

		return null;
	}

	public void printEmployeeList() {
		System.out.println("-------------------------");
		System.out.println("  ID     NAME      AGE      SALARY  ");

		for (Employee employee : empList) {
			System.out.printf("%3d", employee.getId());
			System.out.printf("%10s", employee.getName());
			System.out.printf("%3d", employee.getAge());
			System.out.printf("%5.3f", employee.getSalary());
			System.out.println();
		}

	}
}
