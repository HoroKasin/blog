package Array;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		// 1. 배열의 선언
		char[] letters; 
		
		// 2. 배열의 생성
		letters = new char[4];
		
		// 3. 배열의 초기화
		// 각각의 인덱스에 접근하여 데이터를 저장함.
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 68;
		
		// 4. 배열의 값 참조( 사용  )
		System.out.println("배열의 3번째 데이터의 값:>" + letters[2] );

		/*
		 * 배열 내부에 들어있는 데이터들을 문자열 형태로 한눈에
		 * 확인해보려면 출력문 println()의 매개값으로 
		 * Arrays.toString(배열변수명)을 써주면 됩니다.
		 */
		System.out.println("내부의 데이터를 문자열 형태로 보기:>" + Arrays.toString(letters));
	}

}
