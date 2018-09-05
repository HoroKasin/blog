package Do_While_.Basic;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {

	//How to obtain cumulative sum from 1 to the corresponding number by receiving an integer
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("Please enter an integer.");
		 int target = scan.nextInt();
		 
		 int num = 1;
		 int sum = 0;
		 					
		 do {
			 sum += num;
			 num++;
		 }while(num <= target);
		 System.out.println("1 ~" + target + "Cumulative total:>" + sum);
		 
		 scan.close();
		
	}

}
