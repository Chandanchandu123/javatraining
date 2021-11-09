package com.cruds.test;

import com.cruds.demo.Calculator;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		int result = 0;
		
		try
		{
			result = c.divide(10, 0);
			System.out.println("Inside Main After call to divide=====>>");
		}
		catch (RuntimeException rte)
		{
			System.out.println("Runtime exception "+ rte.getMessage());
		}
		System.out.println("Inside Main =====> Result is " +result);

	}

}
