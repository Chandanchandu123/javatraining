package com.cruds.demo;

public class VehicleProvider {
 
	public static IVehicle getVehicle(String type)
	{
		if(type.equals(IVehicle.TYPE_LUXURY))
		{
			return new Car();
		}
		else if(type.equals(IVehicle.TYPE_PASSENGER))
		{
			return new Bus();
		}
		else if(type.equals(IVehicle.TYPE_FAITHFUL))
		{
			return new Dog();
		}
		else if(type.equals(IVehicle2.TYPE_HEAVYDUTY))
		{
			return new Truck();
		}
		else
		{
			return null;
		}
	}
}
