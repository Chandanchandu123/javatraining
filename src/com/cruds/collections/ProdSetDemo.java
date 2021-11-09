package com.cruds.collections;


import java.util.Set;
import java.util.TreeSet;

public class ProdSetDemo {

	public static void main(String[] args) {
		
		Set<Product> prodSet = new TreeSet<>(new ProdNameComp());
		prodSet.add(new Product(333, "Apple Iphone", 55000));
		prodSet.add(new Product(101, "Samsung Mobile", 19000));
		prodSet.add(new Product(222, "Dell Laptop", 35000));
		
		prodSet.add(new Product(222, "Dell Laptop", 35000));
		
		for(Product p : prodSet)
		{
			System.out.println(p);
		}
	}

}
