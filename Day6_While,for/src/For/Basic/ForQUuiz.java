package For.Basic;

public class ForQUuiz {

	public static void main(String[] args) {

		// To generate a random number of random multiplication
		
		int dan = (int)(Math.random() * 8) + 2;
		
		System.out.println("a random population " + dan + "단");
		System.out.println("-------------");
		for(int i = 1; i <= 9; i ++) {
			System.out.println(dan + " x " + i + " = " + dan * i);
		}
	}

}
