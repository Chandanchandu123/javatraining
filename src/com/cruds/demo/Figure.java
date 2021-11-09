package com.cruds.demo;

public abstract class Figure {

	protected double dim1;
	protected double dim2;
	
	public Figure(double d1, double d2)
	{
		super();
		this.dim1 = d1;
		this.dim2 = d2;
		
		
	}
	public abstract double calculateArea();
	{
		
	}
}
