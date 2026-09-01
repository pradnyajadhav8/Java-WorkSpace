package basic;

import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Rahul", 80);
		Student s2 = new Student(102, "Amit", 70);
		Student s3 = new Student(103, "Sneha", 80);
		Student s4 = new Student(104, "Rohit", 60);
		Student s5 = new Student(105, "Priya", 70);
		
		TreeSet<Student> jpa89 = new TreeSet<Student>();
		jpa89.add(s1);
		jpa89.add(s2);
		jpa89.add(s3);
		jpa89.add(s4);
		jpa89.add(s5);
		

		for (Student student : jpa89)
			System.out.println(student);
		}

}
