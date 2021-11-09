package com.cruds.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> studentMap = new HashMap<>();
		studentMap.put(101, "Kiran");
		studentMap.put(222, "Ravi");
		studentMap.put(303, "Anil");
		
		//iterate over entry set
		Set<Entry<Integer, String>> entrySet = studentMap.entrySet();
		
		for(Entry<Integer, String> e : entrySet)
		{
			System.out.println(e.getKey() + ":"  + e.getValue());
		}
		
		//iterate over key and value set
		Set<Integer> keys = studentMap.keySet();
		for(int k : keys)
		{
			System.out.println(k);
		}
		
		Collection<String> values = studentMap.values();
		for(String v : values)
		{
			System.out.println(v);
		}
		/*System.out.println(studentMap.get(303));
		
		System.out.println(studentMap.get(333));//it gives Null value
		
		studentMap.put(303, "Kumar");
		System.out.println(studentMap.get(303));*/

	}

}
