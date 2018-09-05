package For.Basic;

public class ForExample4 {

	public static void main(String[] args) {

		// drain 8 of the integer from 1 to 100 and output all non-drain numbers of 16 at the same time
		for(int i = 1; i <=100; i++) {
			if(i % 8 == 0 & i % 16 != 0) {
				System.out.print(i + " ");
			}
		}
	}

}
