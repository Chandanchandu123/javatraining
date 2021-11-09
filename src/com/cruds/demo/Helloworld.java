package com.cruds.demo;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name = sc.nextLine();
		
		System.out.println("Please enter your age:");
		
		int age = sc.nextInt();
		
		if(age > 60)
		{
			System.out.println("Sorry you are too old for Java");
			
		}
		else if(age < 18)
		{
			System.out.println("Sorry you are too young for Java");
		}
		else
		{
			System.out.println("welcome " +name+ " to java");
		}
		
		sc.close();

	}

}
