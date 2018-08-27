package While_.Basic;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {

		//정수 하나를 입력받아서 해당 정수가 소수인지를 여부를 판단하는 방법
		Scanner scan = new Scanner(System.in);
		
		System.out.print("소수를 판별할 정수를 입력:>");
		//변수 n은 소수를 판별할 정수값을 저장할 변수공간
		int n = scan.nextInt();
		
		//변수 i는 소수판별을 위해 입력한 정수를 나눠볼 피제수를 저장할 변수공간
		int i = 2;
		
		while(n % i != 0) {
			i++;   //입력받은 정수가 i로 나눠 0이 아닐때 계속 반복
		}
		
		if( n == i) { 
			System.out.println(n + "은(는) 소수입니다.");
		}else {
			System.out.println(n + "은(는) 소수가 아닙니다.");
		}
		
		scan.close();
	}

}
