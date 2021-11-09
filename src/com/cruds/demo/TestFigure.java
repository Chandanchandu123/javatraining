package com.cruds.demo;

public class TestFigure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f = new Rectangle(10, 20);
		System.out.println(f.calculateArea());
		
		Figure f1 = new Triangle(10, 20);
		System.out.println(f1.calculateArea());
	}

}
