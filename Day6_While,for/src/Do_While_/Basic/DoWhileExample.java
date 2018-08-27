package Do_While_.Basic;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {

		//정수를 입력받아서 1부터 해당 숫자까지의 누적합계를 구하는 방법
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.print("정수를 입력하십시오.");
		 int target = scan.nextInt();
		 
		 int num = 1;
		 int sum = 0;
		 					
		 do {
			 sum += num;
			 num++;
		 }while(num <= target);
		 System.out.println("1부터" + target + "까지의 누적합계:>" + sum);
		 
		 scan.close();
		
	}

}
