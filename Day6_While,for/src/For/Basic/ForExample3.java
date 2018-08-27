package For.Basic;

public class ForExample3 {

	public static void main(String[] args) {

		// 1 ~ 100 까지의 정수 중 6의 배수를 모두 출력
		for(int i = 1; i <= 100; i++) {
			if(i % 6 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
