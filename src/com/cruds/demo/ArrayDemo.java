package com.cruds.demo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[3];
		names[0] = "Abhi";
		names[1] = "Chandan";
		names[2] = "Mohan";
		
		String[] names2 = {"Anil","Mahesh","Sanjay"};
		
		for(int i = 0;i< names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		for(String s : names2)
		{
			System.out.println(s);
		}
	}

}
