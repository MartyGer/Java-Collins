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
