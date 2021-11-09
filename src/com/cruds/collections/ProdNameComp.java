package com.cruds.collections;

import java.util.Comparator;

public class ProdNameComp implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		//return p1.getPname().compareTo(p2.getPname()); //ascending order 
		return p2.getPname().compareTo(p1.getPname()); //descending order
	}

}
