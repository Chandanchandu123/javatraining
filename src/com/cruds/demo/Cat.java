package com.cruds.demo;

public class Cat extends Animal{
	
	public void talk()
	{
		System.out.println("Meow Meow!!!");
	}

	@Override
	public void eat() {
		System.out.println("Cat eats Fish");
	}

}
