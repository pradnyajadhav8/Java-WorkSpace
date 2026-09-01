package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {

	int registerStudent(Student student);

	int removeStudent(int id);

	int modifyStudent(Student student);

	List<Student> getAllStudnets();

	Student getStudentById(int id);

}