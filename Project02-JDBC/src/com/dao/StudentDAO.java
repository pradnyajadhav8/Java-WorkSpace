package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDAO {

	int addStudent(Student addstudeent);

	int updatestudent(Student updatestudent);

	int deleteStudent(Student deleteStudent);

	int deleteStudent(int id);

	List<Student> findAllStudent();

	Student findStudentById(int id);

}
