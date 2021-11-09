package com.cruds.demo;

public class BankDemo {
	private int accNo;
	private String custName;
	private double bal;
	
	public BankDemo(int accNo,String custName,double bal)
	{
		this.accNo = accNo;
		this.custName = custName;
		this.bal = bal;
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
