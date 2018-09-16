package collection.map;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		//store an object in map put(Key, Value)
		map.put("Onepiece", 85);
		map.put("쵸파", 95);
		map.put("라이언", 90);
		map.put("피치", 95);
		
		//If a duplicate object is inserted in a key object
		//See object value correction without seeing additional object
		map.put("Hong Gil Dong", 75);
		
		//get total number of object stored size()
		System.out.println("Total Entry Objects: " + map.size());
		System.out.println(map.toString());
		
		//search objects stored in map get(Key)
		// Integer point = map.get ("per gentleman");
		// int p = point.intValue();
		int point = map.get("Shin Saimdang");
		System.out.println("Shin Saimdang Score: " + point);
		
		
		//Loop Map via keySet
		Set<String> kSet = map.keySet();
		System.out.println(kSet.toString());
		
		Iterator<String> kIter = kSet.iterator();
		
		System.out.println("----------------------------");
		
		while(kIter.hasNext()) {
			String name = kIter.next();
			int p = map.get(name);
			System.out.println(name + ": " + p);
		}
		
		//check if the key exists inside the map(s)
		String key = "Hong Gil Dong";
		
		if(map.containsKey(key)) {
			System.out.println(key + "on the score " + map.get(key));
		}else {
			System.out.println(key + "Does not exist.");
		}
		
		//map delete internal data remove()
		map.remove("Hong Gil Dong"); //delete the Entry object in the key
		System.out.println(map.toString());
		
		map.clear();
		
		if(map.isEmpty()) {
			System.out.println("The map is empty.");
		}else {
			System.out.println("Map is not empty.");
		}
		
	}

}
