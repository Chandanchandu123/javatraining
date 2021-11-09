package com.cruds.collections;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> names = new LinkedList<>();
		names.add("Bhaskar");
		names.add("Kiran");
		names.add("Mahesh");
		
		Iterator<String> iter = names.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		names.add(1, "Akshay");//positional access
		names.add("Mahesh");
		for(int i=0; i<names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		/*for(String s : names) Another way 
		{
			System.out.println(s);
		}*/
	}

}
