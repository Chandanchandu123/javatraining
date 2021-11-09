package com.cruds.demo;

public class SalaryDemo {

	public static void main(String[] args) {
		/*SalaryDemo sd = new SalaryDemo();
		sd.printSalary(new Employee());*/
		//create instance of a class bcz static variables cannot access non-static variables
		printSalary(new Manager("Anil","Kumar"));// Illi change madudre output change aagutthe
	}

	private static void printSalary(Object obj)
	{
		if(obj instanceof Director) 
		{
			System.out.println("Salary is 1 lakh");
		}
		
		else if(obj instanceof Manager)
		{
			System.out.println("Salary is 50K");	
		}
		
		else if(obj instanceof Employee)
		{
			System.out.println("Salary is 10K");
		}
}
}
