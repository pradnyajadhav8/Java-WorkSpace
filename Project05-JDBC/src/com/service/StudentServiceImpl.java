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
		int res = 0;
		if (student != null)
			return studentDAO.addStudent(student);
		else {
			try {
				studentDAO.addStudent(student);
			} catch (StudentServiceException e) {
				StudentServiceException ex = new StudentServiceException("student add service failed", e);
				throw ex;
			}
		}
		return res;
	}

	@Override
	public int removeStudent(int id) {
		int res = 0;
		if (id < 1)
			throw new StudentServiceException("id never -ve" + id);

		try {
			res = studentDAO.deleteStudent(id);
		} catch (StudentServiceException e) {
			StudentServiceException ex = new StudentServiceException("student delete service failed", e);
			throw ex;
		}

		return res;
	}

	@Override
	public int modifyStudent(Student student) {
		int res = 0;
		try {
			res = studentDAO.updateStudent(student);
		} catch (StudentServiceException e) {
			StudentServiceException ex = new StudentServiceException("student modify service failed", e);
			throw ex;
		}

		return res;
	}

	@Override
	public List<Student> getAllStudnets() {
		List<Student> list = null;
		try {
			list = studentDAO.findAllStudent();
		} catch (StudentServiceException e) {

			StudentServiceException ex = new StudentServiceException("student read service failed", e);
			throw ex;
		}
		return list;
	}

	@Override
	public Student getStudentById(int id) {
		Student student = null;
		try {
			student = studentDAO.findStudentById(id);
		} catch (StudentServiceException e) {
			StudentServiceException ex = new StudentServiceException("student get by Id service failed", e);
			throw ex;
		}
		return student;
	}

}