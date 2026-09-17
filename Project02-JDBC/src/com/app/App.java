  package com.app;

import java.util.List;
import java.util.Scanner;

import com.dao.StudentDAO;
import com.dao.StudentDAOImpl;
import com.model.Student;

public class App {
	private static final Scanner scanner = new Scanner(System.in);
	private static final StudentDAO studentDAO = new StudentDAOImpl();

	public static void main(String[] args) {
		int option;
		do {
			showMenu();
			System.out.println("Enter Option ");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				addStudent();
				break;
			case 2:
				deleteStudent();
				break;
			case 3:
				updateStudent();
				break;
			case 4:
				showStudent();
				break;
			case 5:
				System.out.println("Thank you for using ! ");
				break;
			default:
				System.out.println("Invalid Choice ! ");
			}
		} while (true);
	}

	private static void updateStudent() {
		// take id
		System.out.println("Enter ID STUDENT ");
		int id = scanner.nextInt();
		Student student = studentDAO.findStudentById(id);
		if (student != null) {
			// show detail findStudentById()
			System.out.println(student);
			// update Details
			System.out.println("ADD UPDATE CHANGES....");
			student = inputStudent();
			student.setId(id);

			// update
			int rows = studentDAO.updatestudent(student);
			if (rows > 0)
				System.out.println("UPDATE SUCCESS");
			else
				System.out.println("FAILED TO UPDATE ");
		} else {
			System.out.println("STUDENT NOT EXIST");
		}
		// update
	}

	private static void deleteStudent() {
		System.out.println("Enter ID STUDENT ");
		int id = scanner.nextInt();

		int rows = studentDAO.deleteStudent(id);
		if (rows > 0)
			System.out.println("DELETE SUCESSFULLY");
		else
			System.out.println("FAILED TO DELETE ");
	}

	private static void addStudent() {
		Student student = new Student();
		student=inputStudent();
		
		int rows = studentDAO.addStudent(student);
		
		if (rows > 0)
			System.out.println("ADD SUCCESS");
		else
			System.out.println("FAILED TO ADD");
	}

	private static void showStudent() {
		System.out.println("************************ DISPLAY ************************");
		List<Student> list = studentDAO.findAllStudent();
		System.out.printf("%-5s %-25s %-5s\t\t %-5s%n", "ID", "NAME", "MARKS", "GENDER");
		System.out.println("==========================================================");
		for (Student student : list)
			System.out.println(student);
	}

	private static void showMenu() {
		System.out.println();
		System.out.println("========================================");
		System.out.println("          STUDENT OP");
		System.out.println("========================================");
		System.out.println(" 1. ADD STUDENT");
		System.out.println(" 2. DELETE STUDENT");
		System.out.println(" 3. UPDATE STUDENT");
		System.out.println(" 4. SHOW STUDENT");
		System.out.println(" 5. EXIT");
		System.out.println("========================================");
	}

	private static Student inputStudent() {
		
		System.out.println("Enter Student name: ");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.println("Enter Marks: ");
		float marks = scanner.nextFloat();
		scanner.nextLine();

		System.out.println("Enter Gender: ");
		String gender = scanner.nextLine();

		return new Student(name, marks, gender);
		
	}
}
