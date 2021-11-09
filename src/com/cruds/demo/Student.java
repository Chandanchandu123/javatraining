package com.cruds.demo;

import java.io.Serializable;

import com.cruds.exception.StudentException;

public class Student implements Serializable{

	private int rollNo;
	private String name;
	
	
	private Address address;
	
	
	
	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public Student(int rollNo, String name, double salary, String pwd) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		
	}

	private static int objCount;
	
	
	//constructor 2 ARG
	public Student(int rollNo, String name) throws StudentException 
	{
		setRollNo(rollNo);
		setName(name);
		//this.rollNo = rollNo;
		//this.name = name;
		objCount++;
		
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static int getObjCount()
	{
		return objCount;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) throws StudentException
	{
		if(rollNo <= 0)
		{
			throw new StudentException("Invalid RollNo "+rollNo );
		}
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws StudentException
	{
		if(name.trim().isEmpty())
		//if( name == null || name.trim().isEmpty())
		{
			throw new StudentException("Name Not be Empty "+name);
		}
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}

	public void printinfo()
	{
		System.out.println("Name:"+ name + " RollNo:" + rollNo);
	}
	}
	

