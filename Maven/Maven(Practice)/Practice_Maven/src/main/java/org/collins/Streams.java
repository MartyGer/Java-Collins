package org.collins;
import java.util.*;
import java.util.stream.*;
public class Streams {
	
	// How to create a Stream?
	// Stream<Integer> firstStream = Stream.empty();
	public static void main(String[] args) {
		Stream <Integer> firstStream = Stream.of(1, 2, 3);
		
		List<String> second = Arrays.asList("First", "Second", "Third");
		Stream<String> secondStream = second.stream();
		secondStream.forEach(e -> {
			System.out.println(e);
		});
		
		// Using Stream Builder
		Stream.Builder<String> third = Stream.<String>builder();
		Stream<String>thirdStream = third.add("Fourth").add("Fifth").build();
		
		thirdStream.forEach(System.out :: println); // Method Reference
		
		// Conversion
		List<String> fourth = Arrays.asList("Sixth", "Seventh");
		Stream<String> fourthStream = fourth.stream();
		
		List<String> fifth = fourthStream.collect(Collectors.toList());
		System.out.println(fifth.toString());
		
		List<String> sixth = Stream.of("Eighth", "Ninth").collect(Collectors.toList());
		System.out.println(sixth.toString());
		
		List<Integer> seventh = IntStream.of(10, 11)
								.mapToObj(Integer::valueOf)
								.collect(Collectors.toList());
		System.out.println(seventh.toString());
		// Or we can use .boxed()
		
		// Intermediate Operations
		// 1. Filter
		Stream<String> eighthStream = Arrays.asList("Car", "Bike", "Bus", "Scooter").stream();
		eighthStream.filter(e -> e.startsWith("B")).forEach(System.out::println);
		
		// 2. Distinct
		Stream<Integer> ninthStream = Arrays.asList(1, 1, 2, 3, 4, 4, 5).stream();
		ninthStream.distinct().forEach(e -> System.out.println(e));
		
		// 3. Limit and 4. Skip
		Stream<Integer> tenthStream = Stream.iterate(1, e -> e + 1)
										.skip(5)
										.limit(5);
		tenthStream.forEach(System.out::println);
		
		
		List<String> list1 = new ArrayList<>();
		list1.add("Science");
		list1.add("Maths");
		University uni = new University("St. John's College", list1);
		uni.print();
		list1.add("Art");
		University uni2 = new University("St. Peter's College", list1);
		// uni2.print();
		
		List<University> uniList = Arrays.asList(uni, uni2);
		//5.  Map 
		uniList.stream()
				.map(University::getName)
				.collect(Collectors.toList())
				.forEach(System.out::println);
		
		// Terminal Operations
		// 1. Count
		Stream<Integer> terminal1 = Stream.iterate(1, e -> e + 1)
				.skip(5)
				.limit(5);
		System.out.println(terminal1.count());
		
	}
	//5.  Map
	public static class University{
		public String name;
		public List<String> subjects;
		
		public University(String name, List<String> subjects)
		{
			this.name = name;
			this.subjects = subjects;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void print()
		{
			System.out.println(name + ", Subjects: " + subjects);
		}
	}
} 