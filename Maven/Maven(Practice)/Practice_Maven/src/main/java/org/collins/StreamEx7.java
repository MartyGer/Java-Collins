package org.collins;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Exercise 7 — Get a list of orders which were ordered on 15-Mar-2021, 
// log the order records to the console and then return its product list
public class StreamEx7 {
	public int orderNo;
	public List<String> products;
	public double price;
	public java.util.Date orderDate;
	public String tier;
	
	public StreamEx7(int orderNo, List<String> products, double price, Date orderDate, String tier)
	{
		this.orderNo = orderNo;
		this.products = products;
		this.price = price;
		this.orderDate = orderDate;
		this.tier = tier;
	}
		
	public String toString()
	{
		return "Order No.: " + this.orderNo + ", Products:" + this.products + ", Price: " + price + ", Order Date: " +
				orderDate.getDate() + " - " + orderDate.getMonth() + " - " + orderDate.getYear();
	}
	
	public Date getDate()
	{
		return orderDate;
	}
	
	public static void main(String[] args) {
		List<String> products1 = Arrays.asList("Sports Shoes", "Football Kit", "Cricket Bat");
		List<String> products2 = Arrays.asList("RC Car", "Toy Train", "Football Kit");
		List<String> products3 = Arrays.asList("Cricket Bat", "Art Book");
		int orderNo1 = 1;
		int orderNo2 = 2;
		int orderNo3 = 3;
		int orderNo4 = 4;
		int orderNo5 = 5;
		
		double price1 = 20100;
		double price2 = 5050;
		double price3 = 260;
		double price4 = 2040;
		
		Date orderDate1 = new Date(2021, 2, 2);
		Date orderDate2 = new Date(2021, 3, 15);
		Date orderDate3 = new Date(2021, 5, 10);
		Date orderDate4 = new Date(2021, 3, 15);
		Date orderDate5 = new Date(2020, 4, 10);
		String tier1 = "Tier 2";
		String tier2 = "Tier 2";
		String tier3 = "Tier 1";
		
		StreamEx7 first = new StreamEx7(orderNo1, products1, price1, orderDate1, tier1);
		StreamEx7 second = new StreamEx7(orderNo2, products2, price2, orderDate2, tier2);
		StreamEx7 third = new StreamEx7(orderNo3, products3, price3, orderDate3, tier3);
		StreamEx7 fourth = new StreamEx7(orderNo4, products1, price4, orderDate4, tier3);
		StreamEx7 fifth = new StreamEx7(orderNo5, products3, price2, orderDate5, tier3);
		
		Date beforeDate = new Date(2021, 4, 1);
		Date afterDate = new Date(2021, 2, 1);
		Date exactDate = new Date(2021, 3, 15);
		
		List<StreamEx7> list = Arrays.asList(first, second, third, fourth, fifth);
		List<String> stream7 = list.stream()
									.filter(x -> x.orderDate.equals(exactDate))
									.peek(System.out::println)
									.flatMap(p -> p.products.stream())
									.distinct()
									.collect(Collectors.toList());
									
		System.out.println(stream7);
		
//		List<String> listOfStream= stream7.flatMap(p -> p.products.stream())
//									.distinct()
//									.collect(Collectors.toList());
//		System.out.println(listOfStream);
	}
}
