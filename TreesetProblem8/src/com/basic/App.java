package com.basic;

import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		Employee s1 = new Employee(1,"IT",6000);
		Employee s2 = new Employee(2,"HR",5000);
		Employee s3 = new Employee(3,"IT",8000);
		Employee s4 = new Employee(4,"HR",7000);
		
		TreeSet<Employee> job = new TreeSet<Employee>();
		job.add(s1);
		job.add(s2);
		job.add(s3);
		job.add(s4);
		
		System.out.printf("%-4s %-24s %-4s \n","ID","Deparment","Salary");
		for (Employee employee : job)
			System.out.println(employee);
		}

}
