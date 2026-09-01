package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.StudentDAOException;
import com.model.Student;
import com.utility.DBUtility;

// database
public class StudentDAOImpl implements StudentDAO {

	@Override
	public int addStudent(Student addStudent) {
		String sql = "insert into STUDENT (name,marks,gender) values(?,?,?)";
		try (Connection con = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = con.prepareStatement(sql);) {

			ps.setString(1, addStudent.getName());
			ps.setFloat(2, addStudent.getMarks());
			ps.setString(3, addStudent.getGender());

			return ps.executeUpdate();

		} catch (SQLException e) {
			StudentDAOException ex = new StudentDAOException("Failed to add", e);
		}
		return 0;
	}

	@Override
	public int updateStudent(Student upstudent) {
		String sql = "UPDATE  STUDENT SET name=? , marks=? , gender=? WHERE id=?";
		// if you are using try with resourced that resource must be type of Closable or
		// AutoClosable
		try (Connection con = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, upstudent.getName());
			ps.setFloat(2, upstudent.getMarks());
			ps.setString(3, upstudent.getGender());
			ps.setInt(4, upstudent.getId());
			return ps.executeUpdate();

		} catch (SQLException e) {
			StudentDAOException ex = new StudentDAOException("Failed to update", e);
		}
		return 0;
	}

	@Override
	public int deleteStudent(Student deletestudent) {

		return deleteStudent(deletestudent.getId());
	}

	@Override
	public int deleteStudent(int id) {
		String sql = "DELETE FROM STUDENT WHERE id=?";
		try (Connection con = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = con.prepareStatement(sql);) {

			ps.setInt(1, id);
			return ps.executeUpdate();

		} catch (SQLException e) {
			StudentDAOException ex = new StudentDAOException("Failed to delete", e);
		}
		return 0;
	}

	@Override
	public List<Student> findAllStudent() {
		List<Student> list = new ArrayList<Student>();
		String sql = "SELECT * FROM STUDENT";
		try (Connection con = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setMarks(rs.getFloat("marks"));
				student.setGender(rs.getString("gender"));
				list.add(student);
			}
			return list;

		} catch (SQLException e) {
			StudentDAOException ex = new StudentDAOException("Failed to fetch", e);
		}
		return list;
	}

	@Override
	public Student findStudentById(int id) {
		String sql = "SELECT * FROM STUDENT WHERE id=?";
		Student student = null;

		try (Connection con = DBUtility.getInstance().getDBConnection();
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
		
			if (rs.next()) {
				student =mapRowStudent(rs);
			}

		} catch (SQLException e) {
			StudentDAOException ex = new StudentDAOException("Failed to find", e);
		}
		return student;

	}
	
	private Student mapRowStudent(ResultSet rs) {
		Student student = new Student();
		
		try {
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setMarks(rs.getFloat("marks"));
		student.setGender(rs.getString("gender"));
		}catch (SQLException e) {
			StudentDAOException ex = new StudentDAOException("mapRowStudent 	", e);
		}
		return student;
		
	}

}