package com.cruds.demo;

import java.util.Scanner;

public class Numdemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[3];
		
		for(int i = 0; i< nums.length; i++)
		{
			System.out.println("Please Enter a number:");
			nums[i] = sc.nextInt();
			
		}
		
		while(true)
		{
		
		System.out.println("Please enter a number to search and -1 to exit");
		int searchNum = sc.nextInt();
		
		if(searchNum == -1)
		{
			break;
		}
		boolean found = false;
		int pos = 0;
		
		for(int i = 0; i < nums.length; i++)
		{
			if(searchNum == nums[i])
			{
				found = true;
				pos = i + 1;
				break;
			
			}
		}
		
		if(found)
		{
				System.out.println(searchNum + " is found at " +pos+ " position");
		}
		else
		{
			System.out.println(searchNum + " is not found");
		}
		  
	}
		sc.close(); 

}
}
