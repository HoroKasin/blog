package api.util.arrays;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr1));
		
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		//arraycopy() message provided by SystemClass
		//pre-create a target array to store the copied array
		char[] arr4 = new char[4];
		
		System.arraycopy(arr1, 0, arr4, 0, 4);
		System.out.println(Arrays.toString(arr4));
		
		char[] arr5 = {'A','B','C','D','E','F'};
		System.arraycopy(arr1, 1, arr5, 3, 3);
		System.out.println(Arrays.toString(arr5));

	}

}










