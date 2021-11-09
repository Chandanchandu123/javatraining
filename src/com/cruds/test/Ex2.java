package com.cruds.test;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=Integer.parseInt( args[0]);
			System.out.println(i);
			
		} catch (NumberFormatException e) 
		{
			System.out.println(e);
		}
		catch(RuntimeException e)
		{
			System.out.println(e);
		}

	}

}
