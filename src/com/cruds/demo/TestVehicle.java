package com.cruds.demo;

public class TestVehicle {

	public static void main(String[] args) {
		
		/*IVehicle b = new Bus();
		b.start();
		b.stop();
		
		IVehicle c = new Car();
		c.start();
		c.stop();*/
		
		//IVehicle v = VehicleProvider.getVehicle(IVehicle.TYPE_FAITHFUL);//illi miss aadre class cast exception barutthe
		//v.start();
		//v.stop();
		
		IVehicle v = VehicleProvider.getVehicle(IVehicle2.TYPE_HEAVYDUTY);
		v.start();
		v.stop();
		
		if(v instanceof IVehicle2)
		{
			((IVehicle2)v).brake();
		}
		
		
		/*if(v instanceof Dog)
		{
			((Dog) v).talk();//type casting
		}*/
		
	}

}
