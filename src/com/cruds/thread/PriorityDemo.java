package com.cruds.thread;

public class PriorityDemo {

	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		Clicker high = new Clicker(Thread.NORM_PRIORITY +2);
		Clicker low = new Clicker(Thread.NORM_PRIORITY -2);
		
		low.start();
		high.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		high.stop();
		low.stop();
		
		System.out.println("High Clicker: "+high.count);
		System.out.println("Low Clicker: "+low.count);
	}

}
