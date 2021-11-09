package com.cruds.thread;

public class ThreadDemo {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("Child 1");
		t1.start();
		
		MyThreadR runobj = new MyThreadR("CHILD RUNNABLE");
		runobj.t.start();
		
		
		try {
			t1.join();
			runobj.t.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		/*for(int i = 5;i > 0;i--)
		{
			System.out.println(Thread.currentThread() + "Count " +i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		System.out.println("Main Thread Exiting ===> ");
	
	}

}
