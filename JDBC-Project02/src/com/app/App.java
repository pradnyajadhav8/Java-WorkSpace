package com.app;

import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;
import com.model.Employee;

public class App {
	private static final Scanner scanner = new Scanner(System.in);
	private static final EmployeeDAO employeeDAO = new EmployeeDAOImpl();

	public static void main(String[] args) {
		int option;

		do {
			showmenu();
			System.out.println("Enter Option: ");
			option = scanner.nextInt();

			switch (option) {

			case 1:
				addEmployee();
				break;
			case 2:
				deleteEmployee();
				break;
			case 3:
				updateEmployee();
				break;
			case 4:
				showEmployee();
				break;
			case 5:
				System.out.println("Thank you for Using...!");
				System.exit(-1);
			default:
				System.out.println("Invalid Choice.....!");
			}

		} while (true);
	}

	public static void showmenu() {

		System.out.println("******************************************");
		System.out.println("			STUDENT OPTION");
		System.out.println("*******************************************");

		System.out.println(" 1. ADD Employee");
		System.out.println(" 2. DELETE Employee");
		System.out.println(" 3. UPDATE Employee");
		System.out.println(" 4. SHOW Employee");
		System.out.println(" 5. EXIT");
		System.out.println("===============================================");

	}

	public static void addEmployee() {
		Employee emp = new Employee();
		emp = inputEmployee();

		int row = employeeDAO.addEmployee(emp);

		if (row > 0)
			System.out.println("ADD SUCCESS");
		else
			System.out.println("FAILED TO ADD");
	}

	public static void deleteEmployee() {
		System.out.println("Enter ID: ");
		int id = scanner.nextInt();

		int row = employeeDAO.deleteEmployee(id);
		if (row > 0)
			System.out.println("Deleted Succesfully. ");
		else
			System.out.println("Failed to Delete. ");
	}

	public static void updateEmployee() {
		System.out.println("Enter Employee ID: ");
		int id = scanner.nextInt();

		Employee emp = employeeDAO.findEmployeeById(id);
		if (emp != null) {

			System.out.println(emp);
			System.out.println("Add Updated Changes.!");

			emp = inputEmployee();
			emp.setId(id);

			int row = employeeDAO.updateEmployee(emp);
			if (row > 0)
				System.out.println("Updated Succesfully..!");
			else
				System.out.println("Updated changes failed..!");

		} else {
			System.out.println("Employee Doesn't Exist..!");
		}

	}

	public static void showEmployee() {
		System.out.println("*******************DISPLAY************************");
		List<Employee> list = employeeDAO.findAllEmplyee();
		System.out.printf("%-5s%-10s %-20s %-20s %-10s", "ID", "NAME", "ADDRESS", "EMAIL", "PHONE NUMBER");
		System.out.println();
		for (Employee emp : list)
			System.out.println(emp);
	}

	public static Employee inputEmployee() {
		System.out.println("Enter id: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter Name: ");
		String name = scanner.nextLine();

		System.out.println("Enter Address: ");
		String address = scanner.nextLine();

		System.out.println("Enter Number: ");
		String number = scanner.nextLine();

		System.out.println("Enter email: ");
		String email = scanner.nextLine();

		return new Employee(id, name, address, number, email);
	}

}
