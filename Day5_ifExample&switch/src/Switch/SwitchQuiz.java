package Switch;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("the position of a company");
		System.out.println("[Employee, Asst Manager, Exaggeration, Deputy director, head of department]");
		System.out.print(":>");
		String position = scan.next();
		
		switch(position) {
		
		case "Employee":
			 System.out.println("Employee Salary -> 2000$!!"); break;
			 
		case "Asst Manager":
			System.out.println("Asst Manager Salary -> 4000$!!"); break;
			
		case "Exaggeration":
			System.out.println("Exaggeration Salary -> 5000$!!"); break;
			
		case "Deputy director":
			System.out.println("Deputy director Salary -> 7000$!!"); break;
			
		case "head of department":
			System.out.println("head of department Salary -> 8000$!!"); break;
			
		default:
			System.out.println("Retype...".");
		}
		scan.close();
	}

}
