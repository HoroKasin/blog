package api.util.arrays;

import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {
		
		int[] scores = {75, 47, 23, 56, 89};
		
		//How to sort the data in an array in ascending order ()
		int[] scores2 = Arrays.copyOf(scores, scores.length);
		Arrays.sort(scores2);
		
		int i = Arrays.binarySearch(scores2, 75);
		System.out.println("Index number with 75: " + i);
		System.out.println(Arrays.toString(scores2));
		
		String[] names = {"Hong Gil Dong", "Mike", "arron"
				, "Shin Saimdang", "Kevin", "Kang In Chan"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		//method equals comparing items in an array(array 1, array2)
		int[] scores3 = Arrays.copyOf(scores, scores.length);
		
//		scores[3] = 166;
		
		if(Arrays.equals(scores, scores3)) {
			System.out.println("Each item in the array matches.");
		}else {
			System.out.println("Each item in the array does not match.");
		}
		

	}

}





