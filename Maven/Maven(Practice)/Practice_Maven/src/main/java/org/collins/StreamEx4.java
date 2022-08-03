package org.collins;

import java.util.*;

// Exercise 4 — Obtain a list of products ordered by customer 
// of tier 2 between 01-Feb-2021 and 01-Apr-2021

public class StreamEx4 {
	public int orderNo;
	public List<String> products;
	public double price;
	public java.util.Date orderDate;
	public String tier;
	
	public StreamEx4(int orderNo, List<String> products, double price, Date orderDate, String tier)
	{
		this.orderNo = orderNo;
		this.products = products;
		this.price = price;
		this.orderDate = orderDate;
		this.tier = tier;
	}
		
	public String toString()
	{
		return this.orderNo + ", Products:" + this.products + ", Price: " + price;
	}
	
	public static void main(String[] args) {
		List<String> products1 = Arrays.asList("Sports Shoes", "Football Kit", "Cricket Bat");
		List<String> products2 = Arrays.asList("RC Car", "Toy Train", "Football Kit");
		List<String> products3 = Arrays.asList("Cricket Bat", "Art Book");
		int orderNo1 = 1;
		int orderNo2 = 2;
		int orderNo3 = 3;
		double price1 = 20100;
		double price2 = 5050;
		double price3 = 260;
		Date orderDate1 = new Date(2021, 2, 2);
		Date orderDate2 = new Date(2021, 3, 5);
		Date orderDate3 = new Date(2021, 5, 10);
		String tier1 = "Tier 2";
		String tier2 = "Tier 2";
		String tier3 = "Tier 1";
		
		StreamEx4 first = new StreamEx4(orderNo1, products1, price1, orderDate1, tier1);
		StreamEx4 second = new StreamEx4(orderNo2, products2, price2, orderDate2, tier2);
		StreamEx4 third = new StreamEx4(orderNo3, products3, price3, orderDate3, tier3);
		
		Date beforeDate = new Date(2021, 4, 1);
		Date afterDate = new Date(2021, 2, 1);
		List<StreamEx4> list = Arrays.asList(first, second, third);
		list.stream()
		.filter(x -> x.tier.equals("Tier 2"))
		.filter(bD -> bD.orderDate.before(beforeDate))
		.filter(aD -> aD.orderDate.after(afterDate))
		.flatMap(p -> p.products.stream())
		.distinct()
		.forEach(System.out::println);
	}
}
