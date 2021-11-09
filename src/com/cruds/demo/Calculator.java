package com.cruds.demo;

public class Calculator {
	
	public int divide(int x,int y)
	{
		int result = 0;
		int[] num = new int[3];
		Student s = null;
		try
		{
			s.getName();
			System.out.println("Before Division");
			result = x/y;
			System.out.println("After division");
		}
		catch(ArithmeticException ae) //naavu most specific exception na first catch madneku last ge most generic exception na madbeku
		{
			System.out.println("Invalid divisor:" +ae.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException aib) {
			System.out.println("Invalid array index:" +aib.getMessage());
		}
		/*catch (NullPointerException npe)
		{
			System.out.println("Null pointer Exception " +npe.getMessage());
		}*/
		finally {
			System.out.println("***Inside finally in Calculator***");
			
		}
		return result;
	}
}
