package For.Basic;

public class MultiForExample {

	public static void main(String[] args) {

		//구구단 전체 출력
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " x " + i + " = " + i * j + "\t");
			}
		}
		
	}

}
