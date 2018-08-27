package For.Basic;

public class ForExample5 {

	public static void main(String[] args) {

		//1 ~ 100까지의 정수 중 9의 배수의 개수를 출력하세요.
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 9 == 0) {
				count++; //i가 9로 나눠질 때마다 카운터가 1씩증가
				System.out.print(i + " \n");
			}
		}
		System.out.println("9의 배수의 개수:> " + count);
	}

}
