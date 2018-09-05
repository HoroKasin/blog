package IF;

import java.util.Scanner;

public class ifQuiz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter one integer.");
		int num = scan.nextInt();
	
		if((num >= 0 ) && (num % 2 ==0)){
			if(num == 0) {
				System.out.println("The integer entered is 0.");
			}else {
				System.out.println(num + "even number");
			}
		}else if(num >= 0 && (num  % 2 == 1)) {
			System.out.println(num + " odd number");
		}else {
			System.out.println(num + " negative integer");
		}
		scan.close();
	}

}
