package com.cruds.demo;

import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankAccount[] bankAcs =new BankAccount[2];
		System.out.println("Please enter acc no:");
		int accNo = sc.nextInt();
		sc.nextLine();//dummy read \r\f
		
		System.out.println("Please enter customer name:");
		String custName = sc.nextLine();
		
		System.out.println("Please enter balance:");
		double bal = sc.nextDouble();
		sc.nextLine();//dummy read \r\f
		
		BankAccount b1 = new BankAccount(accNo,custName,bal);
		bankAcs[0] = b1;
		bankAcs[0].printinfo();
		
		
		
		
		
		
		//bankAcs[0].getCustName().equals(searchName)
		/*BankAccount b2 = new BankAccount(202, "Sanjay", 15000.0);
		b2.printinfo();
		
		BankAccount b3 = new BankAccount(303, "Mohan");
		b3.printinfo();*/
		sc.close();
	}
}
