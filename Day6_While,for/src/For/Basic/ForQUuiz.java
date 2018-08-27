package For.Basic;

public class ForQUuiz {

	public static void main(String[] args) {

		// 2 ~ 9까지의 난수를 생성 후 랜덤으로 구구단이 출력되는 방법
		
		int dan = (int)(Math.random() * 8) + 2;
		
		System.out.println("랜덤 구구단 " + dan + "단");
		System.out.println("-------------");
		for(int i = 1; i <= 9; i ++) {
			System.out.println(dan + " x " + i + " = " + dan * i);
		}
	}

}
