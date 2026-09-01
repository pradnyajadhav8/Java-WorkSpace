package basic;

import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Shah Rukh Khan", 95.5);
		Student s2 = new Student(102, "Amitabh Bachchan", 92.0);
		Student s3 = new Student(103, "Alia Bhatt", 88.5);
		Student s4 = new Student(104, "Ranbir Kapoor", 90.0);
		Student s5 = new Student(105, "Deepika Padukone", 94.5);
		Student s6 = new Student(103, "Alia Bhatt", 88.5);
		Student s7 = new Student(104, "Ranbir Kapoor", 90.0);

		TreeSet<Student> jpa89 = new TreeSet<Student>();
		jpa89.add(s1);
		jpa89.add(s2);
		jpa89.add(s3);
		jpa89.add(s4);
		jpa89.add(s5);
		jpa89.add(s6);
		jpa89.add(s7);

		for (Student student : jpa89)
			System.out.println(student);
		}

}
