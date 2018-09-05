package collection.list;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();

		long start, end;

		start = System.currentTimeMillis();

		for(int i=0; i<300000; i++) {
			list1.add(0, i);
		}

		end = System.currentTimeMillis();

		System.out.println("ArrayList Taken Time: " + (end-start) + "ms");

		start = System.currentTimeMillis();

		for(int i=0; i<300000; i++) {
			list2.add(0, i);
		}

		end = System.currentTimeMillis();

		System.out.println("LinkedList Time: " + (end-start) + "ms");


	}

}








