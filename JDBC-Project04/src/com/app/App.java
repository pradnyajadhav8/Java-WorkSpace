package com.app;

import java.util.Scanner;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;


public class App {
	
	private static Scanner scanner=new Scanner(System.in);
	private static EmployeeService service=new EmployeeServiceImpl();
	
	public static void main(String[] args) {
		int option;
		
		do {
			showMenu();
			System.out.println("Enter Option:");
			option=scanner.nextInt();
			
			switch(option) {
			case 1:
				addEmployee(); break;
			case 2:
			}
			
		}while(true);
	}
	
	private static void showMenu() {
		System.out.println("______________________________________________________________________");
		System.out.println("         				 Employee Option");
		System.out.println("______________________________________________________________________");
		System.out.println(" 1. ADD STUDENT");
		System.out.println(" 2. DELETE STUDENT");
		System.out.println(" 3. UPDATE STUDENT");
		System.out.println(" 4. SHOW STUDENT");
		System.out.println(" 5. EXIT");
		System.out.println("______________________________________________________________________");
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
		
	}
}
