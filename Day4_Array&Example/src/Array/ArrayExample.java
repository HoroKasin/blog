package Array;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		// 1. 배열의 선언
		char[] letters;
		
		// 2. 배열의 생성
		// 배열은 생성시 크기를 명시함, 한번 설정한 크기는 변경 불가능하다.
		letters = new char[4];
		
		// 3. 배열의 초기화
		// 각 인덱스에 접근하여 데이터를 저장함.
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 78;
		
		// 4. 배열의 값 참조 (사용)
		System.out.println("배열의 3번째 데이터의 값:>" + letters[2]);
		
		System.out.println("=============================");
		
		/*
		 * 배열 내부에 들어있는 데이터들을 문자열 형태로 한눈에
		 * 확인해보려면 출력문 println()의 매개값으로 
		 * Arrays.toString(배열변수명)을 써주면 됩니다.
		 */
		System.out.println(Arrays.toString(letters));
		
		System.out.println("=============================");
		
		//배열의 선언과 생성, 초기화를 동시에 하는 방법.
		byte[] bArr = new byte[5];
		int[] iArr = new int[] {4, 6, 8, 10};
		
		String[] sArr = {"hello", "my", "name", "is"};
		
		System.out.println(Arrays.toString(bArr));
		System.out.println(Arrays.toString(iArr));
		System.out.println(Arrays.toString(sArr));
	
	}
	

}
