package com.cruds.thread;

public class Printer { 
	
	public void print(String msg)//other way to use synchronization
	{
		System.out.print("[" +msg);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("]");
		
	}

}
