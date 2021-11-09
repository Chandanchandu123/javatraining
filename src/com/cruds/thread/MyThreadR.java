package com.cruds.thread;

public class MyThreadR implements Runnable {
	
	Thread t;
	public MyThreadR (String name) {
		t = new Thread(this, name);
	}
	

	@Override
	public void run() {
		System.out.println("Inside Child Thread Run Method "+Thread.currentThread());
		
		for(int i = 5;i > 0;i--)
		{
			System.out.println(this + "Count " +i);
			
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exiting RUN Method ===> " +this);
	
	}

}
