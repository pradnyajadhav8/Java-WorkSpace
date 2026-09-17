package com.app;

import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;
import com.model.Employee;

public class App {

	private static Scanner scanner = new Scanner(System.in);
	private static EmployeeDAO employeeDAO = new EmployeeDAOImpl();

	public static void main(String[] args) {
		int input;
		do {
			showMenu();
			System.out.println("Enter option: ");
			input = scanner.nextInt();

			switch (input) {
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
				readEmployee();
				break;
			case 5:
				System.out.println("Thankyouuuuuuuuuuuuuuuuuuuuu.....!");
				System.exit(-1);
			default:
				System.out.println("Invalid Input...!");
			}
		} while (true);

	}

	private static void showMenu() {
		System.out.println();
		System.out.println("========================================");
		System.out.println("               EMPLOYEE DATA ");
		System.out.println("========================================");
		System.out.println(" 1. ADD EMPLOYEE");
		System.out.println(" 2. DELETE EMPLOYEE");
		System.out.println(" 3. UPDATE EMPLOYEE");
		System.out.println(" 4. SHOW EMPLOYEE");
		System.out.println(" 5. EXIT");
		System.out.println("========================================");
	}

	private static Employee input() {
		System.out.println("Enter ID:");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter Name:");
		String name = scanner.nextLine();

		System.out.println("Enter Address: ");
		String address = scanner.nextLine();

		System.out.println("Enter Number: ");
		String number = scanner.nextLine();

		System.out.println("Enter Email:");
		String email = scanner.nextLine();
		return new Employee(id, name, address, number, email);
	}

	private static void addEmployee() {
		Employee emp = input();
		int row = employeeDAO.addEmployee(emp);
		if (row > 0)
			System.out.println("Employee Success Added..!");
		else
			System.out.println("Employee failed to Add..!");
	}

	private static void deleteEmployee() {
		System.out.println("Enter id:");
		int id = scanner.nextInt();
		int row = employeeDAO.deleteEmployeeById(id);
		if (row > 0)
			System.out.println("SuucessFully Deleted Employee..!");
		else
			System.out.println("Failed to Delete..!");
	}

	private static void updateEmployee() {
		System.out.println("Enter id:");
		int id = scanner.nextInt();
		Employee emp = employeeDAO.findEmployeeById(id);
		if (emp != null) {
			System.out.println(emp);
			System.out.println("Add Updated Changes..!");

			emp = input();
			emp.setId(id);
			int row = employeeDAO.updateEmployee(emp);
			if (row > 0)
				System.out.println("Employee Updated SucessFully..!");
			else
				System.out.println("Employee failed to update...!");
		} else {
			System.out.println("Employee is not found..!");
		}

	}

	private static void readEmployee() {
		System.out.println("=============================================================");
		System.out.println("                     DISPLAY EMPLOYEE");
		System.out.println("=============================================================");
		List<Employee> list = employeeDAO.showAllEmployee();
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}
}
