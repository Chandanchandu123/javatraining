package com.cruds.demo;

public class Counter {
	
	public static int OBJECTCOUNT;
	
	public Counter()
	{
		OBJECTCOUNT++;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object count before finalize" + OBJECTCOUNT);
		OBJECTCOUNT--;
		System.out.println("Object count after finalize" + OBJECTCOUNT);
	}

}
