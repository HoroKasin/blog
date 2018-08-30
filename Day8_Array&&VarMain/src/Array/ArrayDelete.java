package Array;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 8, 10, 12, 14};
		System.out.println(Arrays.toString(arr));
		
		for(int i=2; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		System.out.println(Arrays.toString(arr));
	}
}


