package collection.list;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//create ArrayList object.
		List<String> list = new ArrayList<>();
		
		String str1 = "Java";
		String str2 = "JSP";
		
		//How to store objects in list()
		list.add(str1);//Saves the object at the end of the list.
		list.add(str2);
		list.add("DataBase");
		list.add("JDBC");
		list.add("JSP");//List can be duplicated.
		
		//get total number of objects stored in list size()
		int size = list.size();
		System.out.println("Total number of objects stored in the list: " + size);
		
		//output as list internal value string toString()
		System.out.println(list.toString());
		
		//Inserting objects in list add (index, objects)
		list.add(2, "Oracle");
		System.out.println(list.toString());
		
		//Modify data in list set (index, object)
		list.set(3, "MySQL");
		System.out.println(list.toString());
		
		//Import data from list get(index)
		String str = list.get(1);
		System.out.println("Objects in index number 1: " + str);
		
		//indexOf (object) to check the index value of objects in the list
		int index = list.indexOf("Oracle");
		System.out.println("Index number where Oracle is stored: " + index);
		
		//indexOf() returns -1 if you search for an object that does not exist.
		index = list.indexOf("HELLO");
		System.out.println(index);
		
		//list delete data remove()
		list.remove(5);
		System.out.println(list.toString());
		
		list.remove("Oracle");
		System.out.println(list.toString());
		System.out.println("Number of objects inside the list: " + list.size());
		
		//Delete all objects inside the list.
		list.clear();
		System.out.println(list.toString());
		
		//Method to check whether data is inside the list ().
		if(list.isEmpty()) {
			System.out.println("list empty");
		}else {
			System.out.println("list is not empty");
		}

	}

}









