package For.Basic;

public class ForStarExample1 {

	public static void main(String[] args) {

		int floor = 5;
		
		for(int i = 0; i < floor; i++) {
			for(int j = 0; j < i +1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
