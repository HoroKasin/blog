package Casting;

public class CastingOperator {

	public static void main(String[] args) {
		
		/*
		 * ũ�Ⱑ �ٸ� ������ Ÿ���� ������ ������ ����
		 * ũŰ�� ���� ������ Ÿ���� ū ������Ÿ������
		 * �ڵ� ����ȯ(Promotion)�Ǿ� Ÿ���� ���� �� ������ �մϴ�.
		 */
		
		char c ='B';
		System.out.println("�ڵ� ����ȯ ��:>" + c);
		int i = 2;
		System.out.println("�ڵ� ����ȯ ��:>" + i);
		char c1 = (char) (c + i);
		System.out.println("�ڵ� ����ȯ ��:>" + c1);
	
		System.out.println("----------------------");
		
		int j = 10;
		System.out.println("�ڵ� ����ȯ ��:>" + j);
		double k = j / 4.0;
		System.out.println("�ڵ� ����ȯ ��:>" + k);
		
		System.out.println("----------------------");
		
		byte b1 = 100;
		System.out.println("�ڵ� ����ȯ ��:>" + b1);
		byte b2 = 70;
		System.out.println("�ڵ� ����ȯ ��:>" + b2);
		byte b3 = (byte) (b1 + b2);
		System.out.println("�ڵ� ����ȯ ��:>" + b3);
	}

}
