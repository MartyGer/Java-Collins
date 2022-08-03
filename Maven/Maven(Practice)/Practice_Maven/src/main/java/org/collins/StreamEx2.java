package org.collins;
import java.util.*;
import java.util.stream.*;

// Exercise 2 — Obtain a list of order with products belong to category “Baby”
public class StreamEx2 {
	public String category;
	public List<String> products;
	
	public StreamEx2(String category, List<String> products)
	{
		this.category = category;
		this.products = products;
	}
	
	public String toString()
	{
		return this.category + ", Products:" + this.products;
	}
	
	public static void main(String[] args) {
		List<String> products1 = Arrays.asList("Men's Shoes", "Men's Grooming Kit", "Men's Perfume");
		List<String> products2 = Arrays.asList("Women's Shoes", "Women's Personal Care kit", "Women's Perfume");
		List<String> products3 = Arrays.asList("Baby's Shoes", "Baby's Clothes");
		String category1 = "Men";
		String category2 = "Women";
		String category3 = "Baby";
		StreamEx2 first = new StreamEx2(category1, products1);
		StreamEx2 second = new StreamEx2(category2, products2);
		StreamEx2 third = new StreamEx2(category3, products3);
		
		List<StreamEx2> list = Arrays.asList(first, second, third);
		
		list.stream()
			.filter(x -> x.category.equals(category3))
			.forEach(System.out::println);



		
		
		
	}
}
