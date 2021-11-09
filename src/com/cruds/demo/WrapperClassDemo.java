package com.cruds.demo;

import java.util.ArrayList;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		int i = 5;
		Integer i1 = new Integer(5); //Boxing or Wrapping
		
		Integer i2 = i; //AutoBoxing
		
		int j = i1.intValue(); //Unboxing
		
		int k = j; //Auto unboxing
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(99);
		values.add(00);
		
		

	}

}
