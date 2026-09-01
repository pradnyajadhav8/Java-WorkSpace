package com.app;

import java.util.*;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp1;
import com.basic.Employee;

public class App {
	private static Scanner scanner = new Scanner(System.in);

	private static Employee inputEmployee() {
		Employee employee = new Employee();
		System.out.println("Enter Id");
		employee.setId(scanner.nextInt());
		System.out.println("Enter NAME");
		scanner.next();
		employee.setName(scanner.nextLine());
		System.out.println("Enter AGE");
		employee.setAge(scanner.nextInt());
		System.out.println("Enter SALARY");
		
		employee.setSalary(scanner.nextDouble());
		return employee;
	}

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDaoImp1();

		int option;
		int x;
		do {
			System.out.println("--------------------------------");
			System.out.println(" 1 : ADD EMPLOYEE ");
			System.out.println(" 2 : DELETE EMPLOYEE ");
			System.out.println(" 3 : CHECK EMPLOYEE ");
			System.out.println(" 4 : TOTAL EMPLOYEE ");
			System.out.println("--------------------------------");
			System.out.println("Enter Option Number  !!!");
			option = scanner.nextInt();

			switch (option) {

			case 1:
				Employee employee = inputEmployee();
				if (dao.addEmployee(employee))
					System.out.println("ADD SUCCESS !!!");
				else {
					try {
						throw new RuntimeException("Failed To Add Employee  " + employee);
					} catch (Exception e) {
						// throw e;
						e.printStackTrace();
					}
				}
				break;

			case 2:
				Employee removeEmployee = inputEmployee();
				if (dao.removeEmployee(removeEmployee))
					System.out.println("Remove  SUCCESS !!!");
				else
					throw new RuntimeException("Employee Not Found");
				break;

			case 3:
				Employee searchEmployee = inputEmployee();
				if (dao.isEmployeePresent(searchEmployee)) {
					System.out.println("Employee Found ....");
					// printEmployee
				} else {
					System.err.println("Employee Not Found....");
				}
				break;
			case 4:
				System.out.println("Total Employees : " + dao.totalEmployees());
				break;

			case 5:
				System.out.println("Enter Id Employee To Update");
				int id = scanner.nextInt();

				Employee updateEmployee = inputEmployee();

				if (dao.updateEmployee(id, updateEmployee))
					System.out.println("Empoyee Update SUCESSS");
				else
					System.out.println("Empoyee Update Failed");
				break;

			case 6:
				System.out.println("List Of Employee Enter Range Of ---  >Age ");
				System.out.println("From AGE  ");
				int fromAge = scanner.nextInt();
				System.out.println("To AGE  ");
				int toAge = scanner.nextInt();

			}
			System.out.println("DO YOU WANT TO CONTINUE  PRESS 1  ...");
			x = scanner.nextInt();
		} while (x == 1);

	}

}
