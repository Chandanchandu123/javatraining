package com.cruds.demo;

public class Triangle extends Figure {

	public Triangle(double dim1,double dim2)
	{
		super(dim1, dim2);
		
	}

	@Override
	public double calculateArea() {
	
		return 0.5*dim1*dim2;
	}
	
}
