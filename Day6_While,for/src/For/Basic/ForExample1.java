package For.Basic;

public class ForExample1 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println("1부터 10까지의 합계:> " + sum);
		
	}

}
