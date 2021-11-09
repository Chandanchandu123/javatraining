
package com.cruds.demo;

import java.io.Serializable;

public class Book implements Serializable{

	private String title;
	private double price;
	private int id;

	public Book(String title,double price,int id){
	this.title = title;
	this.price = price;
	this.id = id;	
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", id=" + id + "]";
	}

	public void printbook()
	{
		System.out.println("Title:" + title+ " Price :" +price+ " BookId:" +id);
		
	}
}