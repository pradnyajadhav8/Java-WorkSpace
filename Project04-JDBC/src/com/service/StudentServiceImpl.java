package com.service;

import java.util.List;

import com.dao.StudentDAO;
import com.dao.StudentDAOImpl;
import com.exception.StudentServiceException;
import com.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDAO studentDAO = new StudentDAOImpl();

	@Override
	public int registerStudent(Student student) {
		if (student != null)
			return studentDAO.addStudent(student);
		else {
			try {
				throw new StudentServiceException("Student Can't be null");
			} catch (StudentServiceException e) {

			}
		}
		return 0;
	}

	@Override
	public int removeStudent(int id) {
		if (id < 1)
			throw new StudentServiceException("id never -ve" + id);

		return studentDAO.deleteStudent(id);
	}

	@Override
	public int modifyStudent(Student student) {
		return studentDAO.updateStudent(student);
	}

	@Override
	public List<Student> getAllStudnets() {
		return studentDAO.findAllStudent();
	}

	@Override
	public Student getStudentById(int id) {
		return studentDAO.findStudentById(id);
	}

}