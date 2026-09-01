package com.model;

public class Student {
	private int id;
	private String name;
	private float marks;
	private String gender;

	public Student() {

	}

	public Student(int id, String name, float marks, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}

	public Student(String name, float marks, String gender) {
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String toString() {
		return String.format("%-5d %-25s %-5f %-5s", id, name, marks, gender);

	}

}