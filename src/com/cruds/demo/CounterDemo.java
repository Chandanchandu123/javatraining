package com.cruds.demo;

public class CounterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		c1 = null;
		c2 = null;
		System.gc();
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
