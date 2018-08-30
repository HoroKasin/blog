package Array;

import java.util.Arrays;

public class ArrayUpdate {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 9};
		System.out.println(Arrays.toString(arr));
		
		arr[1] = 33;		
		arr[3] = 77;
		
		System.out.println(Arrays.toString(arr));
	}//end main class
}//end class
