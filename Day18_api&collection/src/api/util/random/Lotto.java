package api.util.random;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		int[] winLotto = new int[6];
		Random r1 = new Random();

		for(int i=0; i<winLotto.length; i++) {
			winLotto[i] = r1.nextInt(45) + 1;
		}
		Arrays.sort(winLotto);

		int cnt = 0;

		while(true) {

			int[] myLotto = new int[6];
			Random r2 = new Random();

			for(int i=0; i<myLotto.length; i++) {
				myLotto[i] = r2.nextInt(45) + 1;
			}
			Arrays.sort(myLotto);
			
			cnt++;
			
			if(Arrays.equals(winLotto, myLotto)) {
				System.out.println("You won the first prize.");
				System.out.println(cnt + "winning count ");
				System.out.println("Total purchase "
						+ "amount up to winning: " + (long)(cnt * 1000) + "¿ø");
				break;
			}else {
				System.out.println("Lotto " + cnt + "Number of Lotto purchases");
			}
		}
	}

}








