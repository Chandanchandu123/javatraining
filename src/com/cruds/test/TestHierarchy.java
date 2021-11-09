package com.cruds.test;

public class TestHierarchy {
	public static void main(String[] args) {
		Z z = new Z();
	}
	}
	class X {
		X()
		{
			super(); //default super
			System.out.println("Inside X constructor");
		}
	}
	 class Y extends X {
		 Y()
		 {
			 super(); //default super 
			 System.out.println("Inside Y constructor");
		 }
	}
	 class Z extends Y {
		 Z()
		 {
			 super();//default super
			 System.out.println("Inside Z constructor");
		 }
	 }

