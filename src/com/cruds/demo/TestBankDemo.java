package com.cruds.demo;

import java.util.Scanner;

public class TestBankDemo {
public static void main(String[] args) {
		
		BankAccount[] accs = new BankAccount[25];
		int pos = 0;
		Scanner sc = new Scanner(System.in);
		
		String choice = "";
		do{
			System.out.println("Please select your Choice:");
			System.out.println("1.Add Bank Account");
			System.out.println("2.Show all Bank Accounts");
			System.out.println("3.Search Bank Account by Customer Name");
			System.out.println("4.Show Bank Account by Balance");
			System.out.println("5.Exit");
			choice = sc.nextLine();
			//System.out.println("Choice is "+ choice);
			
			switch(choice)
			{
			case "1": System.out.println("Adding Bank Account");
				System.out.println("Please enter customer name:");
				String custName = sc.nextLine();
				
				System.out.println("Please enter acc no:");
				int accNo = sc.nextInt();
				sc.nextLine(); //dummy read
			
				System.out.println("Please enter balance:");
				double bal = sc.nextDouble();
				sc.nextLine(); //dummy read
				BankAccount ba = new BankAccount(accNo,custName,bal);
				accs[pos] = ba;
				pos++;
				System.out.println("Bank Account Added successfully");
				break;
			case "2":
				System.out.println("Show all the Bank Accounts");
				for(BankAccount b1 : accs)
				{
					if(b1 !=null)
					{
						b1.printinfo();
					}
				}
				break;
			case "3": 
				System.out.println("Please enter Customer name to search");
				String searchName = sc.nextLine();
				boolean found = false;
				for(BankAccount b : accs)
				{
					if(b !=null && b.getCustName().equals(searchName))
					{
						found = true;
						b.printinfo();
					}
				}
				if(!found)
				{
					System.out.println("Sorry ! Customer name not found");
				}
				break;
			case "4": 
					System.out.println("Please Enter the Balance");
					  double searchBal = sc.nextDouble();
					  sc.nextLine();
					  for(BankAccount b : accs)
					  {
						  if(b !=null && b.getBal() >= searchBal)
						  {
							 
							  b.printinfo();
						  }
					  }  
				break;
			case "5": System.out.println("Bye !! Exiting Application");
				break;
			
			default:
				System.out.println("Invalid choice!");
				break;
				}
						
					}while(!choice.equals("5"));
					sc.close();
				}
}

