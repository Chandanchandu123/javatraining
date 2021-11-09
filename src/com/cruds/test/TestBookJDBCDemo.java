package com.cruds.test;

import java.util.List;
import java.util.Scanner;

import com.cruds.db.BookDAO;
import com.cruds.demo.Book;

public class TestBookJDBCDemo {

	public static void main(String[] args) {
		BookDAO dao = new BookDAO();
		Scanner sc = new Scanner(System.in);
		
		String choice = "";
		do
		{
			System.out.println("Please select your choice:");
			System.out.println("1.Add Books");
			System.out.println("2.Display Books");
			System.out.println("3.Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextLine();
			
			switch(choice)
			{
			case "1":
				System.out.println("---Adding of Books---");
				System.out.println("Enter the Book Title");
				String BookTitle = sc.nextLine();
				System.out.println("Enter the Book Price");
				double BookPrice = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter Book Id");
				int BookId = sc.nextInt();
				sc.nextLine();
				Book b = new Book(BookTitle, BookPrice, BookId);
				if(dao.create(b))
				{
				System.out.println("Books added successfully");
				}
				break;
			case "2":System.out.println("------Displaying of all Books-----");
				List<Book>list = dao.getAllBooks();
				for(int i = 0; i<list.size();i++)
				{
				System.out.println("BookTitle:"+ list.get(i).getTitle()+ "\t BookPrice:" + list.get(i).getPrice()+ "\t BookId:"+ list.get(i).getId());
				/*for(Book b : list)
				{
					System.out.println(b);
				}*/
				
				}
				break;
			case "3":
				System.out.println("BYE!!!!! Exiting Application");
				break;
				
			default:
					System.out.println("Invalid choice!!!!!");
					break;
			}
		}while(!choice.equals("3"));
		sc.close();

	}

}
