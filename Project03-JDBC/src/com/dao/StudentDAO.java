package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDAO {

	int addStudent(Student addStudent);

	int updateStudent(Student updatestudent);

	int deleteStudent(Student deletestudent);

	int deleteStudent(int id);

	List<Student> findAllStudent();

	Student findStudentById(int id);
}