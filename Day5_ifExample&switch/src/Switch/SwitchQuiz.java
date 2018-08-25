package Switch;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("직급을 입력!");
		System.out.println("[사원, 대리, 과장, 차장, 부장]");
		System.out.print(":>");
		String position = scan.next();
		
		switch(position) {
		
		case "사원":
			 System.out.println("사원의 급여 -> 200만원!!"); break;
			 
		case "대리":
			System.out.println("대리의 급여 -> 400만원!!"); break;
			
		case "과장":
			System.out.println("과장의 급여 -> 500만원!!"); break;
			
		case "차장":
			System.out.println("차장의 급여 -> 700만원!!"); break;
			
		case "부장":
			System.out.println("차장의 급여 -> 800만원!!"); break;
			
		default:
			System.out.println("직급 다시 입력...");
		}
		scan.close();
	}

}
