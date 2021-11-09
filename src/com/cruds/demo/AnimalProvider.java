package com.cruds.demo;

import com.cruds.test.Horse;

public class AnimalProvider {
	
	public static Animal getAnimal(String type)
	{
		if(type.equals("FAITHFUL"))
		{
			return new Dog();
		}
		else if(type.equals("CUTE"))
		{
			return new Cat();
		}
		else if(type.equals("FAST"))
		{
			return new Horse();
		}
			return null;
		
	}
}
