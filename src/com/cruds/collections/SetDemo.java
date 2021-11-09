package com.cruds.collections;


import java.util.Iterator;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<>();
		names.add("Anil");
		names.add("Chandan");
		names.add("Bhaskar");
		
		Iterator<String> iter = names.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		for(String s : names) //Another way 
		{
			System.out.println(s);
		}

	}

}
