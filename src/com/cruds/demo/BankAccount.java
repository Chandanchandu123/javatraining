package com.cruds.demo;

public class BankAccount {
	private int accNo;
	private String custName;
	private double bal;
	
	public BankAccount(int accNo,String custName, double bal)
	{
		//this.accNo = accNo;
		//this.custName = custName;
		this(accNo,custName);
		this.bal = bal;
		//System.out.println("INSIDE 3 ARG CONSTRUCTOR");
	}
	
	public BankAccount(int accNo, String custName)
	{
		this.accNo = accNo;
		this.custName = custName;
		//System.out.println("INSIDE 2 ARG CONSTRUCTOR");
	}
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	public void printinfo()
	{
		System.out.println("Account Number " +accNo+  " Customer Name " +custName+ " Balance:" + bal);
	}
	
}
