package org.collins;
import java.util.*;
import java.util.stream.*;

import org.collins.Streams.University;

// Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
public class StreamEx1 {
	
	public String name;
	public String category;
	public String creator;
	public int year;
	public int price;
	
	public StreamEx1(String name, String category, String creator, int year, int price)
	{
		this.name = name;
		this.category = category;
		this.creator = creator;
		this.year = year;
		this.price = price;		
	}

	public String toString()
	{
		return name + ", Category: " + category + ", Price: " + price;
	}
	
	public static void main(String[] args) {
		StreamEx1 firstBook = new StreamEx1("1984", "Book", "George Orwell", 1949, 150);
		StreamEx1 secondBook = new StreamEx1("L.O.T.R", "Book","J.R.R. Tolkien", 1954, 290);
		StreamEx1 thirdBook = new StreamEx1("The Great Gatsby", "Book", "F. Scott Fitzgerald", 1925, 50);
		StreamEx1 fourthBook = new StreamEx1("Pride and Prejudice", "Book", "Jane Austin", 1813, 48);
		StreamEx1 fifthBook = new StreamEx1("The Diary Of A Young Girl", "Book", "Anne Frank", 1947, 160);
		StreamEx1 sixthBook = new StreamEx1("The Hobbit", "Book", "J.R.R. Tolkien", 1949, 60);
		StreamEx1 firstCar = new StreamEx1("Verna", "Car", "Hyundai", 2010, 600000);
		StreamEx1 secondCar = new StreamEx1("City", "Car", "Honda", 2003, 350000);
		// Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
		List<StreamEx1> allBooks = Arrays.asList(firstBook, secondBook, thirdBook, fourthBook,
												fifthBook, sixthBook, firstCar, secondCar);
		allBooks.stream()
					.filter(e -> e.category.equals("Book"))
					.filter(x -> x.price < 100)
					.forEach(System.out::println);
		
		
	}
}
