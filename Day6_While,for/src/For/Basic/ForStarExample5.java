package For.Basic;

public class ForStarExample5 {

	public static void main(String[] args) {

		int floor = 5;
		
		for(int i=0; i<floor; i++) {
			for(int j=0; j<floor-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
		
	}

}
