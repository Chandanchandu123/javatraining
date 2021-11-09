package com.cruds.demo;

public class Truck implements IVehicle2 {

	@Override
	public void start() {
		System.out.println("Truck Start");
		
	}

	@Override
	public void stop() {
		System.out.println("Truck Stop");
	}

	@Override
	public void brake() {
		System.out.println("Truck brake");
		
	}

}
