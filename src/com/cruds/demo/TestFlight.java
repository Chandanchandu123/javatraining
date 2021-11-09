package com.cruds.demo;

public class TestFlight {

	public static void main(String[] args) {

		IFly f = FlightProvider.getFly(IFly.TYPE_SUPERMAN);
		f.fly();
		

	}

}
