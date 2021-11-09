package com.cruds.demo;

public class Rectangle extends Figure {
	
	public Rectangle(double dim1,double dim2)
	{
		super(dim1,dim2);
	}
	
	

	@Override
	public double calculateArea() {
		
		return dim1 * dim2;
	}

}
