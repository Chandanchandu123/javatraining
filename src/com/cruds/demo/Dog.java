package com.cruds.demo;

public class Dog extends Animal implements IVehicle{

	public void talk()
	{
		super.talk();
		System.out.println("Bow Wow!!!");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats pedigree");
	}

	@Override
	public void start() {
		System.out.println("Dog Starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Dog Stopping");
		
	}
}
