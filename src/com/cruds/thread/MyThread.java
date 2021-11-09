package com.cruds.thread;

public class MyThread extends Thread{
	
	public MyThread(String name)
	{
		super(name);
	}
	
	public void run()
{
	System.out.println("Inside Child Thread Run Method "+this);
	
	for(int i = 5;i > 0;i--)
	{
		System.out.println(this + "Count " +i);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("Exiting RUN Method ===> " +this);
}
}