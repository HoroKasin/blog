package IF;

import java.util.Scanner;

public class ifExample2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력을 하십시오.");
		System.out.print("키:>");
		double height = scan.nextDouble();
		
		System.out.println("나이:>");
		int age = scan.nextInt();
		
		System.out.println("===============");
		
		//키가 140이고, 나이가 8살 이상일 경우만 놀이기구 탑승
		if((height >= 180) && (age >= 8 )) {
			System.out.println("놀이기구에 탑승이 가능합니다.");
		}else {
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}
		System.out.println("즐거운 하루 보내세요.~");
		scan.close();
	}

}
