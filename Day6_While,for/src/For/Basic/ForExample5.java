package For.Basic;

public class ForExample5 {

	public static void main(String[] args) {

		//Print out the number of multiples of 9 of the integer from 1 to 100.
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 9 == 0) {
				count++; //The counter increases by one each time i is divided by nine
				System.out.print(i + " \n");
			}
		}
		System.out.println("the number of multiples of 9:> " + count);
	}

}
