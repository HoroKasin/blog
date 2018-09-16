package collection.set;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(98);
		scores.add(87);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println(scores.toString());
		
		Integer s = null;
		
		s = scores.first();
		System.out.println("the lowest score: " + s);
		
		s = scores.last();
		System.out.println("the highest score: " + s);
		
		s = scores.lower(95);
		System.out.println("a score just below 95: " + s);
		
		s = scores.higher(95);
		System.out.println("a score just above 95: " + s);
		
		s = scores.floor(95);
		System.out.println("95 points or points below: " + s);
		
		s = scores.ceiling(85);
		System.out.println("85 points or above: " + s);
		
		while(!scores.isEmpty()) {
			s = scores.pollFirst();
			System.out.println(s + "(Number of Objects Remaining: " 
						+ scores.size() + ")");
		}
	}

}