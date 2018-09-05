package While_.Basic;

public class WhileExample1 {

	public static void main(String[] args) {

		// To obtain the cumulative sum from 1 to 10
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++; // use to end a repeating statement through control variable control
		}
		System.out.println("The sum of 1 to 10 is:>" + sum);
	}

}
