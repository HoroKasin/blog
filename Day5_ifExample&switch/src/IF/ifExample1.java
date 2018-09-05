package IF;

public class ifExample1 {

	public static void main(String[] args) {

		// create an integer random number from 0 to 100
		int point = (int)(Math.random() * 101);
		System.out.println("Score:>" + point);
		
		if(point >= 60) {
			System.out.println("More than 60 points!!!");
			System.out.println("I'm accepted.");
		}else {
			System.out.println("60 points or lower");
			System.out.println("It's a failure.");
		}
		System.out.println("Thank you for your efforts.!@");
	}

}
