package com.cruds.demo;

public class FlightProvider {

	public static IFly getFly(String type)
	{
		if(type.equals(IFly.TYPE_BIRD))
		{
			return new Bird();
		}
		else if(type.equals(IFly.TYPE_SUPERMAN))
				{
			return new Superman();
				}
		else if(type.equals(IFly.TYPE_PLANE))
		{
			return new Plane();
		}
		else {
			return null;
		}

	}

}
