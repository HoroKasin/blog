package Casting;

public class CastingExample1 {

	public static void main(String[] args) {

		/*
		 * ũ�Ⱑ ���� ������ Ÿ�� ������ ū ������Ÿ������ 
		 * ��ȯ�� ���� �ڹ� ���� �ӽ�(JVM0�� ������ Ÿ���� 
		 * �ڵ����� ��ȯ�Ѵ�. [Promotion / Upcasting]
		 */
		
		byte b = 10;
		System.out.println("�� ��ȯ��: >" + b);
		int i = b; // byte - > int �ڵ� �� ��ȯ 
		System.out.println("�� ��ȯ��: >"+ i);

		System.out.println("----------------------");
				
		char c = '��';
		System.out.println("�� ��ȯ��: >" + c);
		int j = c; //char -> int �ڵ� �� ��ȯ
		System.out.println("�� ��ȯ��: >"+ j);
		
		System.out.println("----------------------");
		
		int k = 500;
		System.out.println("�� ��ȯ��: >" + k);
		double  d = k; // int -> double �ڵ� �� ��ȯ
		System.out.println("�� ��ȯ��: >"+ d);
	}

}
