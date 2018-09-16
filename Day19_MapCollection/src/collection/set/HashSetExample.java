package collection.set;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		//Add an object to the setadd()
		set.add("Java");
		set.add("JSP");
		set.add("JDBC");
		set.add("Oracle");
		set.add("MySQL");
		boolean b1 = set.add("DataBase");
		//set does not allow storage of duplicate objects (address)
		boolean b2 = set.add("JSP");
		
		System.out.println(b1);
		System.out.println(b2);
		//method size() to determine the number of objects stored in the set
		System.out.println("Number of objects stored in set: " + set.size());
		System.out.println(set.toString());
		
		//Find Objects in Set
		//To use object data from the set, use the Iterator
		//Reject all objects to target repeatedly
		Iterator<String> iter = set.iterator();
		
		//The replicate object uses the next() message to
		//If you no longer have data to query back, you will receive an exception
		//check if data can be imported into the haNext() because it occurs
		while(iter.hasNext()) {
			String str = iter.next();
			if(str.equals("Oracle")) {
				System.out.println(str);
			}
		}
		
		//remove data purging function from set(), clar()
		set.remove("JDBC");
		System.out.println(set.toString());
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("Set is empty.");
		}else {
			System.out.println("Set is not empty.");
		}
				

	}

}

