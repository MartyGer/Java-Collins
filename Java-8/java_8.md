## JAVA (8)
i) Static and Default methods
Static methods have been present before the JAVA 8 update, but this update is for the Interface. So, now we can have methods similar to the abstract class methods. This means that now not only the abstract methods are a part of the Interface but also the implementation is included in the #Interface.
For e.g
# Default Method
```
public interface University
{
    void getName();
    default void greeting()
    {
        System.out.println("Welcome to the Univeristy"); 
    }
}

public class College implements University
{
    String name = "St. John's College";
    public void getName()
    {
        System.out.println(name);
    }

    public static void main(String[] args)
    {
        College clg = new College();
        clg.getName();
        clg.greeting();
    }
}
```
# Static Method
```
public interface University
{
    void getName();
    static void greeting()
    {
        System.out.println("Welcome to the Univeristy"); 
    }
}

public class College implements University
{
    String name = "St. John's College";
    public void getName()
    {
        System.out.println(name);
    }

    public static void main(String[] args)
    {
        College clg = new College();
        clg.getName();
        greeting();
    }
}
```

ii) Optional, Lambda Expressions, MethodReferences, Streams and StreamPipelining
# Streams
They are an API and has been introduced in the JDK 8 of Java. These don't directly write or change the data in any way or form. Hence, we can't call them a Data Structure. We use these to fetch/retreive the data and as it is functional in nature so it takes less LOC to write the code. 

```
// Ways to create Stream in Java
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
```
# Operations in Stream API
i) Intermediate Operations\
These operations generate and return another Stream. These will not generate anything until and unless the Terminal Operation takes place. These operations can also be chained together. For e.g map(), filter(), limit().

ii) Terminal Operations\
These operations actually generates a result. After this operation, we cannot reuse the Stream again. For e.g forEach(), toArray(), min() etc.

# Stream Pipeline
It is 3 phase process of the stream. The stream API follows the following pipeline:
i) Source\
ii) Intermediate Operations\
iii) Terminal Operations



