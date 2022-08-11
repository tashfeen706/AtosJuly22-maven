package com.qa.app.encapsulation;

public class Customer {

	//if a class has getters & setters it is read & write
	//if a class only has setters it is write-only
	//if a class only has getters it is read-only
	
	//variables - only visible within this class when it's private
	private String name;
	private int age;
	private String address;
	private int accountNo;
	
	//constructor - initialising your class - set initial values of variables
	//default constructor - no return type
	public Customer() {
	}
	
	//constructor with fields
	//auto-generate: right click, source, generate constructor using fields, select all, generate
	public Customer(String name, int age, String address, int accountNo) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.accountNo = accountNo;
	}
	
	
	//getters & setters
	//auto-generate: right-click on the class, source, generate getters and setters, select all, generate
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", address=" + address + ", accountNo=" + accountNo + "]";
	}
	
	
	
	
	
}
