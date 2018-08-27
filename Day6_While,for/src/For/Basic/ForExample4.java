package For.Basic;

public class ForExample4 {

	public static void main(String[] args) {

		// 1 ~100까지의 정수 중 8의 배수이면서 동시에 16의 배수가 아닌 수를 모두 출력
		for(int i = 1; i <=100; i++) {
			if(i % 8 == 0 & i % 16 != 0) {
				System.out.print(i + " ");
			}
		}
	}

}
