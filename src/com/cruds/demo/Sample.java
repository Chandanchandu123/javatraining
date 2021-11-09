package com.cruds.demo;

public class Sample {
	
	 int i_val = 10;
	 Sample()
	 {
		 System.out.println("Inside No args" +i_val);
	 }
	 Sample(int i_val)
	 {
		 this();
		 this.i_val=i_val;
		 System.out.println("Inside Sample i_val:" +i_val);
	 }
	public static void main(String[] args) {
		Sample obj = new Sample(20);
	}
}
		/*System.out.println(obj.i_val);
		obj.printi_val();
		//System.out.println("i_val is :" +i_val);

	}
	public void printi_val()
	{
		System.out.println(i_val);
	}
}*/
