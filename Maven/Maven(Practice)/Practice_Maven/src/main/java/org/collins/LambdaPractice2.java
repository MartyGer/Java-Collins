package org.collins;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaPractice2 {
	
//	public void empty()
//	{
//		
//	}
	public static void main(String[] args) {
//		LambdaInterface lambda = () -> {
//			System.out.println("Welcome to Java 8");
//		};
//		
//		lambda.empty();
		
//		LambdaInterface lambda = (s) -> {
//			System.out.println(s);
//		};
//		
//		lambda.notEmpty("We are inside the function");
		LambdaInterface lambda = (str1, str2) -> {
			System.out.println(str1 + " " + str2);
		};
		
		lambda.notEmpty("I am a part", "of Java 8");
		
		LambdaInterface lambda2 = lambda;
		lambda2.notEmpty("Different", "String");
		
		// Stream
		Collection<String> collection = Arrays.asList("a", "b", "c");
		Stream<String> streamOfCollection = collection.stream();
		streamOfCollection.forEach((String element) ->{
			System.out.println(element);
		});
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4); 
		Stream<Integer> stream = numbers.stream();
		stream.forEach((Integer element) ->{
			System.out.println(element);
		});
		
		Stream<String> streamString = Stream.of("alpha", "bravo", "charlie");
		streamString.forEach((String e) ->{
			System.out.println(e);
		});
		
		List<String> listString = Arrays.asList("a", "b", "c");
		Stream<String> listStream = listString.stream();
		
		// Using builder method
		Stream.Builder<String> builder = Stream.builder();
		Stream<String> streamString2 = builder.add("Welcome").add("to").add("JAVA-8").build();
		
		streamString2.forEach((String e) -> {
			System.out.println(e);
		});
		
		// streamString2.forEach(System.out::println);
		
		// Convert Stream (String) to a List
		Stream.Builder<String> builder3 = Stream.builder();
		Stream<String> streamString3 = builder3.add("Welcome").add("to").add("JAVA-8").build();
		List<String> convert = streamString3.collect(Collectors.toList());
		System.out.println(convert.toString());
		
		// Convert Stream (int: Primitive) to a List
		List<Integer> listInt = IntStream.of(1, 2, 3, 4, 5).boxed().collect(Collectors.toList());
		System.out.println(listInt.toString());
		
		// Another way of converting an int(Stream) to a List
		List<Integer> listInt2 = IntStream.of(1,3, 5, 7, 9).mapToObj(Integer::valueOf).collect(Collectors.toList());
		System.out.println();
		
		
		
		
		
	}

}
