package com.validator;

import com.model.Student;

public class StudentValidator {
	public static String msg = "";

	public static boolean isStudentValid(Student student) {
		
		String pattern = "^[a-zA-Z]+$";

		if (student.getName().trim().equals("") || student.getName().trim().equals("null")) {
			msg = "Name Can not be Null or Empty";
			return false;

		}
		if (!student.getName().matches(pattern)) {
			msg = "Name Contains Only Alphabets..!";
			return false;

		}
		if (!(student.getMarks() >= 0 && student.getMarks() <= 100)) {
			msg = "Marks must be between (0-100) :)";
			return false;

		}
		if (!(student.getGender().toUpperCase().equals("MALE") || student.getGender().toUpperCase().equals("FEMALE"))) {
			msg = "Only Male Or Female";
			return false;

		}
		return true;
	}

	public String getMsg() {
		return msg;
	}

	
}
