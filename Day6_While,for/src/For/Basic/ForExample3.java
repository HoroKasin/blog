package For.Basic;

public class ForExample3 {

	public static void main(String[] args) {

		// print all multiples of 6 of the integer from 1 to 100
		for(int i = 1; i <= 100; i++) {
			if(i % 6 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
