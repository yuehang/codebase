package com.ognldemo.model;

import java.util.Map;

public class Employee {
	private String name;
	private int age;
	private float salary;
	//��Ա�Ļ�����ַ
	private Address address;
	//��Ա��Email��Ϣ
	private String[] emails;
	//��Ա�������˻���Ϣ
	private Map<String,String> accounts;
	
	public Employee(String name,int age,float salary,Address address,String[] emails,Map<String, String> accounts){
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.emails = emails;
		this.accounts = accounts;
	}
	
	public Employee(){
		
	}

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String[] getEmails() {
		return emails;
	}

	public void setEmails(String[] emails) {
		this.emails = emails;
	}

	public Map<String, String> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<String, String> accounts) {
		this.accounts = accounts;
	}
}
