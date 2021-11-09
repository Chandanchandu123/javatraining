package com.cruds.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestBookDemo {

	public static void main(String[] args) {
		Book[] b1 = new Book[10];
		
		int pos = 0;
		Scanner sc = new Scanner(System.in);
		
		
		
		String choice = "";
		do{
			System.out.println("Please select your Choice:");
			System.out.println("1.Add Books");
			System.out.println("2.Show all Books");
			System.out.println("3.Search Books by Title");
			System.out.println("4.Show Books by price");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextLine();
			
			switch(choice)
			{
			case "1":
				
				System.out.println("Adding Books");
				System.out.println("Enter a Book Title");
				String BookTitle = sc.nextLine();
				System.out.println("Enter Book Price");
				
				boolean valid = true;
				try
				{
					if(sc.hasNextDouble())
					{
						//double BookPrice = sc.nextDouble();
						valid = true;
					}
					else {
						sc.next();
						valid = false;
						System.out.println("Enter the Valid Price of Book");
					}
				}catch (InputMismatchException ex)
				{
					System.out.println("Invalid Input");
				}
				double BookPrice = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter Book Id");
				boolean berror = true;
					try
					{
						if(sc.hasNextInt())
						{
						berror = true;
						}
						else
						{
							sc.next();
							berror = false;
							System.out.println("Enter the valid Book ID");
						}
					}catch (InputMismatchException ime)
					{
						System.out.println("Invalid Input!!!!!!");
					}
				int BookId = sc.nextInt();
				sc.nextLine();
				Book b2 = new Book(BookTitle, BookPrice, BookId);
				b1[pos] = b2;
				pos++;
				System.out.println("Books added successfully");
				try
				{
					FileOutputStream fos = new FileOutputStream("Book.ser");
					ObjectOutputStream os = new ObjectOutputStream(fos);
					
					for(int i=0;i<pos;i++)
					{
						Book bs = b1[i];
						os.writeObject(bs);
					}
					//os.writeObject(b2);
					os.close();
					fos.close();
					
					System.out.println("Book Objects written Successfully");
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
				break;
				
			case "2":
				System.out.println("Display Books");
				
				for(int i = 0;i < pos;i++)
				{
					Book b3 = b1[i];
					if(b3 !=null)
					{
					b3.printbook();
					}
				}
				break;
			
			case "3":
				System.out.println("Search Books by Title");
				System.out.println("Enter title of a book");
				
				String searchTitle = sc.nextLine();
				boolean found = false;
				for(Book b : b1)
				{
					if(b!=null && b.getTitle().equals(searchTitle))
					{
						found = true;
						b.printbook();
						break;
					}
				}
				if(!found)
				{
					System.out.println("Sorry!!! Book not Found");
				}
				break;
				
			case "4":
				System.out.println("Search Book by Price");
				System.out.println("Enter price of a book");
				
				double searchPrice = sc.nextDouble();
				sc.nextLine();
				
				for(int i = 0;i < pos;i++)
				{
					Book b4 = b1[i];
					if(b4 !=null && b4.getPrice()>= searchPrice)
					{
						b4.printbook();
					}
				}
				break;
				
			case "5":
				System.out.println("BYE!!!!! Exiting Application");
				break;
				
			default:
					System.out.println("Invalid choice!!!!!");
					break;
				}
				
			}while(!choice.equals("5"));
		
		try
		{
			FileInputStream fis = new FileInputStream("Book.ser");
			ObjectInputStream os = new ObjectInputStream(fis);
			Book bs = (Book) os.readObject();
			
			//os.readObject().toString();
			//Book b2 = (Book)os.readObject().toString();
			/*for(Book bs : b1 )
			{
				
			}*/
			os.close();
			fis.close();
			
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		for(Book bs :b1)
		{
			System.out.println(bs);
		}
		sc.close();
		}
			}