package Switch;


public class SwitchCalculator {

	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.println("�� ���� ����ϴ� �����Դϴ�.");
			System.out.println("��� ��: 5 x 4");
			return; //���� �޼��带 ������.
		}
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[2]);
		
		switch(args[1]) {
		
		case "+":
			System.out.println("�� ���� ����: " + (n1 + n2));
			break;
		case "-":
			System.out.println("�� ���� ����: " + (n1 - n2));
			break;
		case "x":
			System.out.println("�� ���� ����: " + (n1 * n2));
			break;
		case "/":
			System.out.println("�� ���� ��������: " + (n1 / n2));
			break;
		}

	}

}

