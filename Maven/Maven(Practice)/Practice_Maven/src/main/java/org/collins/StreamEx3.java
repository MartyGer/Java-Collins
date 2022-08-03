package org.collins;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

// Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
public class StreamEx3 {
	public String category;
	public List<String> products;
	public double price;
	
	public StreamEx3(String category, List<String> products, double price)
	{
		this.category = category;
		this.products = products;
		this.price = price;
	}
		
	public String toString()
	{
		return this.category + ", Products:" + this.products + ", Price: " + price;
	}
	
	public static void main(String[] args) {
		List<String> products1 = Arrays.asList("Sports Shoes", "Football Kit", "Cricket Bat");
		List<String> products2 = Arrays.asList("RC Car", "Toy Train", "Monopoly");
		List<String> products3 = Arrays.asList("Crayons", "Art Book");
		String category1 = "Sports";
		String category2 = "Toys";
		String category3 = "Art and Craft";
		double price1 = 20100;
		double price2 = 5050;
		double price3 = 260;
		StreamEx3 first = new StreamEx3(category1, products1, price1);
		StreamEx3 second = new StreamEx3(category2, products2, price2);
		StreamEx3 third = new StreamEx3(category3, products3, price3);
		
		List<StreamEx3> list = Arrays.asList(first, second, third);
		list.stream()
		.filter(x -> x.category.equals("Toys"))
		.map(p -> p.price * 90/100)
		.forEach(System.out::println);
	}
}
