package org.collins;
import java.util.*;

public class LambdaPractice {
	
	public static void main(String[] args)
	{
		// Without the help of Lambda
		/*
		 * Comparator<String> cmptor = new Comparator<>(); {
		 * 
		 * @Override public int compare(String a, String b) { return a.compareTo(b); }
		 * };
		 */
		Comparator<String> cmptor = (String a, String b) -> {
			return a.compareTo(b);
		};
		String s3 = new String("Start");
		int result = cmptor.compare("Start", "Start");
		System.out.println(result);
		String s1 = "Start";
		String s2 = "Start";
		System.out.println(s1.equals(s2));
	
	}

}
