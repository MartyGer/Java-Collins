package org.collins;

import java.util.*;

public class App 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(9);
        for (Integer i : list)
        {
        	System.out.println(i);
        }
        list.remove(3);
        System.out.println("After Deletion");
        for (Integer i : list)
        {
        	System.out.println(i);
        }
        System.out.println("EOF!");
        
        
		/*
		 * Thread th = new Thread(() -> System.out.println("Thread")); th.start();
		 */
        
    }
}
