package Method;

public class MethodExample2 {
	
	static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	static int sub(int n1, int n2, int n3) {
		return n1 - n2 - n3;
	}
	
	static int multi(int n1, int n2, int n3) {
		return n1 * n2 * n3;
	}
	static int devide(int n1, int n2) {
		return n1 / n2;
	}
	
	static int calculateBirthYear(int age) {
		return 2018 - age + 1;
	}

	public static void main(String[] args) {
		
		/*
		int n1 = 10;
		int n2 = 20;
		
		int result = n1 + n2;
		System.out.println(result);
		
		n1 = 40;
		n2 = 50;
		result = n1 + n2;
		System.out.println(result);
		*/
		int addData = add(15, 12);
		System.out.println("�� ���� ����: " + addData);
		System.out.println("�� ���� ����: " + sub(20, 7, 11));
		
		/*
		 * 1. 3���� ������ ���ؼ� ����� 
		 *    �����ִ� �޼��带 �����ϰ� ȣ���ϼ���.
		 *    multi()
		 * 2. 2���� ������ �������� ����� �����ִ�
		 *    �޼��带 �����ϰ� ȣ���ϼ���.
		 *    devide()
		 * 3. ���ϱ� �����ڴ� *�̰�, ������ �����ڴ� / �Դϴ�.     
		 */
		System.out.println("10 X 5 X 3 = " + multi(10,5,3));
		System.out.println("560 / 280 = " + devide(560, 280));
		
		/*
		 * 1. ���̸� �Ű������� �޾Ƽ� ����⵵�� ��ȯ�ϴ�
		 *    �޼��带 �����ϰ� ȣ���Ͽ� �������� ����ϴ�
		 *    ������ �����ϼ���.
		 * 2. ���̴� �ѱ��� ���̷� ����ϼ���.
		 * 3. �޼����̸��� calculateBirthYear()   
		 */
		int birthYear = calculateBirthYear(24);
		System.out.println("����� " 
					+ birthYear + "����Դϴ�.");		

	}

}




