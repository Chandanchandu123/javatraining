package com.cruds.demo;

import java.util.Scanner;

public class NameDir {

	public static void main(String[] args) {
		
		String[] names = new String[25];
		int position = 0;
		Scanner sc = new Scanner(System.in);
		
		String choice = "";
		
		do{
			System.out.println("Please select your Choice:");
			System.out.println("1.Enter a name");
			System.out.println("2.Search for a name");
			System.out.println("3.Display all names");
			System.out.println("4.Delete a name");
			System.out.println("5.Exit");
			
			choice = sc.nextLine();
			// System.out.println("Choice is "+ choice);
			
			switch(choice)
			{
			case "1": System.out.println("Please enter the name to add");
				names[position] = sc.nextLine();
				position++;
				System.out.println("Name added Successfully");
				break;
			case "2":
				System.out.println("Please enter name to search");
				String searchName = sc.nextLine();
				boolean found = false;
				for(int i=0; i< position;i++)
				{
					if(searchName.equals(names[i]))
					{
						found = true;
						break;//out of the loop
					}
				}
				if(found)
				{
					System.out.println(searchName + " Found");
				}else
				{
					System.out.println("Sorry " + searchName + " not found");
				}
				break;
			case "3": System.out.println("---Names---");
				for(int i = 0;i < position;i++)
				{
					if(names[i] !=null){
					System.out.println(names[i]);
				}
				}
				break;
			
			case "4":
				System.out.println("Please enter name to delete");
				String delName = sc.nextLine();
				boolean delflg = false;
				
				for(int i = 0; i <position; i++)
				{
					if(delName.equals(names[i]))
					{
						delflg = true;
						names[i] = null;
						break;
					}
				}
				if(delflg)
				{
					System.out.println(delName + " Name deleted successfully");
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


