package com.cruds.demo;

import java.util.Scanner;

public class NameDemo {

	public static void main(String[] args) {
		 String[] names = new String[3];
		 
		 Scanner sc = new Scanner(System.in);
		  
		 for(int i = 0;i < names.length;i++)
		 {
			 System.out.println("Please enter a name");
			 names[i] = sc.nextLine();
		 }
		 
		 while(true)
		 {
			 System.out.println("Please Enter a name to search");
			 String searchName = sc.nextLine();
			 
			 if(searchName.equalsIgnoreCase("q"))
			 {
				 System.out.println("Exiting Application");
				 break;
			 }
			 
			 boolean found = false;
			
			 
			 for(String s : names)
			 {
				 if(s.equals(searchName))
				 	{
					 found = true;
						
						break;
				 	}
			 }
			 if(found)
				{
						System.out.println(searchName + " is found");
				}
				else
				{
					System.out.println(searchName + " is not found");
				}
		 }
	
		 sc.close();
		 
	}

}
