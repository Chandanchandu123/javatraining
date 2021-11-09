package com.cruds.thread;

public class Clicker implements Runnable{
	Thread t;
	long count;
	private volatile boolean running = true;
	
	public Clicker(int p)
	{
		t=new Thread(this);
		t.setPriority(p);
	}

	@Override
	public void run() {
		while(running)
		{
			count++;
		}
	}
	public void stop()
	{
		running = false;
	}
	public void start()
	{
		t.start();
	}
}
