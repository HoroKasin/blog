package Break;

public class BreakExample1 {

	public static void main(String[] args) {

		int i = 0;
		while(true) {
			if(i == 24) {
				break;
			}			
			System.out.println(i);
			i++;
		}
	}

}
