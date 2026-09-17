package com.model;

public class Employee {
	private int id;
	private String name;
	private String address;
	private String number;
	private String email;

	public Employee(){}

	public Employee(int id, String name, String address, String number, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.number = number;
		this.email = email;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("%-5s%-10s%-20s%-20s%-10s \n", id, name, address,email, number);
	}

}
