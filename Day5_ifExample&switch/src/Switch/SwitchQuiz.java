package Switch;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է�!");
		System.out.println("[���, �븮, ����, ����, ����]");
		System.out.print(":>");
		String position = scan.next();
		
		switch(position) {
		
		case "���":
			 System.out.println("����� �޿� -> 200����!!"); break;
			 
		case "�븮":
			System.out.println("�븮�� �޿� -> 400����!!"); break;
			
		case "����":
			System.out.println("������ �޿� -> 500����!!"); break;
			
		case "����":
			System.out.println("������ �޿� -> 700����!!"); break;
			
		case "����":
			System.out.println("������ �޿� -> 800����!!"); break;
			
		default:
			System.out.println("���� �ٽ� �Է�...");
		}
		scan.close();
	}

}
