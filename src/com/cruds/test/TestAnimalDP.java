package com.cruds.test;

import com.cruds.demo.Animal;
import com.cruds.demo.AnimalProvider;

public class TestAnimalDP {

	public static void main(String[] args) {
		
		Animal a = AnimalProvider.getAnimal("FAST");
		a.talk();

	}

}
