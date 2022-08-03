package org.collins;
import java.util.*;
import java.util.stream.*;

import org.collins.Streams.University;

// Exercise 5 — Get the cheapest products of “Books” category
public class StreamEx5 {
	
	public String name;
	public String category;
	public String creator;
	public int year;
	public int price;
	
	public StreamEx5(String name, String category, String creator, int year, int price)
	{
		this.name = name;
		this.category = category;
		this.creator = creator;
		this.year = year;
		this.price = price;		
	}

	public String toString()
	{
		return name + ", Cateory: " + category + ", Price: " + price;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public static void main(String[] args) {
		StreamEx5 firstBook = new StreamEx5("1984", "Book", "George Orwell", 1949, 150);
		StreamEx5 secondBook = new StreamEx5("L.O.T.R", "Book","J.R.R. Tolkien", 1954, 290);
		StreamEx5 thirdBook = new StreamEx5("The Great Gatsby", "Book", "F. Scott Fitzgerald", 1925, 50);
		StreamEx5 fourthBook = new StreamEx5("Pride and Prejudice", "Book", "Jane Austin", 1813, 48);
		StreamEx5 fifthBook = new StreamEx5("The Diary Of A Young Girl", "Book", "Anne Frank", 1947, 160);
		StreamEx5 sixthBook = new StreamEx5("The Hobbit", "Book", "J.R.R. Tolkien", 1949, 60);
		StreamEx5 firstCar = new StreamEx5("Verna", "Car", "Hyundai", 2010, 600000);
		StreamEx5 secondCar = new StreamEx5("City", "Car", "Honda", 2003, 350000);
		// Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
		List<StreamEx5> allBooks = Arrays.asList(firstBook, secondBook, thirdBook, fourthBook,
												fifthBook, sixthBook, firstCar, secondCar);
//		allBooks.stream()
//					.filter(e -> e.category.equals("Book"))
//					.min(Comparator.comparing(StreamEx5::getPrice));

		
		  Stream<StreamEx5> ex5Stream = allBooks.stream() .filter(e ->
		  e.category.equals("Book")) .sorted(Comparator.comparing(StreamEx5::getPrice));
		 
		allBooks.stream()
				.filter(e -> e.category.equals("Book"))
				.sorted(Comparator.comparing(StreamEx5::getPrice))
				.forEach(System.out::println);
		
		Optional<StreamEx5> op = ex5Stream.findFirst();
		op.ifPresent(System.out::println);
		System.out.println(op.get());
		// Use of for loop.
//		ex5Stream.forEach(System.out::println);
	}
}
