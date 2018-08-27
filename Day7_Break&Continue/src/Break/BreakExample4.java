package Break;

public class BreakExample4 {

	public static void main(String[] args) {
		
		banana: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='f') {
					break banana;
				}
			}
		}

	}

}
