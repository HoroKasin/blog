package Var;

public class VariableExample {

	public static void main(String[] args) {
		
		/*
		 * ������ ���� ���.
		 * [������ Ÿ��] [���� �̸�];
		 * ������ ������ �̸����� �ߺ� ������ �� �����ϴ�.
		 * int�� ������ �����ϴ� ��ǥ���� ������ Ÿ���Դϴ�.
		 */
		int number1;
		
		//������ �ʱ�ȭ
		number1 = 10;
		System.out.println("number1�� ����� ������: " + number1);
		
		//������ ����� �ʱ�ȭ�� ���ÿ� �ص��˴ϴ�.
		int number2 = 20;
		
		//�������� �������������� �̿��ؼ� ������ �� �ֽ��ϴ�.
		int result = number1 + number2;
		System.out.println("result: " + result);
		
		//������ �����̸����� �ߺ������� �� �����ϴ�.
//		int number2 = 30;
		
		number2 = 50;
		System.out.println("number2: " + number2);
		
		result = number1 + number2;
		System.out.println(result);
	}

}








