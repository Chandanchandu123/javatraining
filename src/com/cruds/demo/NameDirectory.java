package com.cruds.demo;

import java.util.Scanner;

public class NameDirectory {

	public static void main(String[] args) 
	{
		String str[] = new String[5];
		int index=0;
		Scanner sc = new Scanner(System.in);
		boolean close = true;

		do
		{
			System.out.println();
			System.out.println("Display Menu");
			System.out.println("1. Add Name");
			System.out.println("2. Search Name");
			System.out.println("3. Show All Name");
			System.out.println("4. Delete Name");
			System.out.println("5. Exit");
			System.out.println();
			System.out.println("Enter the choice");

			String choice = sc.next();
			
			switch (choice)
			{
			case "1":
				System.out.println("enter the name");
				String name = sc.next();
				str[index]= name;
				index++;
				System.out.println("Added succesfully!!");	
				break;

			case "2":
				System.out.println("Searching Names");
				System.out.println("Please enter the name to search");
				String searchName = sc.next();
				boolean found = false;
				for(int i=0;i<str.length;i++)
				{
					if(searchName.equals(str[i]))
					{
						found=true;
						break;
					}
				}
				if(found)
				{
					System.out.println(searchName +" found");
				}
				else
				{
					System.out.println(searchName + " Not found");
				}
				break;

			case "3":
				System.out.println("Displaying all the names");
				for(String s : str)
				{
					System.out.println(s);
				}	
				break;

			case "4":
				System.out.println("Deleting the names");
				System.out.println("Enter name to deleted");
				String delName = sc.next();
				boolean delete = false;
				for(int j=0 ;j<str.length;j++){

					if(delName.equals(str[j]))
					{
						
						/*for (int k=j;k<str.length-1;k++)
						{
							//str[k]=str[k+1];
						}
						delete=true;*/
						str[j] = null;
						
						System.out.println("deleted successfully");
						break;
						
					}
					else
					{
						System.out.println("Name not found");
						break;
					}
				}
					
					/* if(delete)
					{
						System.out.println(delName+ " is deleted");
						
					}
					else
					{
						System.out.println(delName+ " Name not found cannot be deleted");
						
					}*/
					 break;

				
			case "5":
				System.out.println("---------Exit---------");	
				close=false;
				break;



			default:
				System.out.println("You entered invalid choice");

				break;
			}

		}while(close);
		sc.close();
	}

}
