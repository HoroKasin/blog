package For.Basic;

public class ForExample1 {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int num = 1; num <= 10; num++) {
			sum += num;
		}
		System.out.println("Cumulative sum from 1 to 10:> " + sum);
		
	}

}
