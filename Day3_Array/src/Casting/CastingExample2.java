package Casting;

public class CastingExample2 {

	public static void main(String[] args) {
		
		/*
		 * ũ�Ⱑ ū ������ Ÿ���� ���� ������ Ÿ������
		 * ��ȯ�Ϸ��� �ݵ�� ĳ��Ʈ ������(type)�� ����Ͽ�
		 * ��������� �� ��ȯ�� �ؾ� �Ѵ�.
		 */

		int i = 72;
		System.out.println("�� ��ȯ��:>" + i);
		char c = (char)i;
		System.out.println("�� ��ȯ��:>" + c);
		
		System.out.println("------------------------");
		
		//double -> int ���� �� ��ȯ�� �������� �ս��� �߻��Ѵ�.
		double d = 3.73213;
		System.out.println("�� ��ȯ��:>" + d);
		int j = (int)d;
		System.out.println("���� �� ��ȯ��:>" + j);
		
		System.out.println("------------------------");
		
		/*
		 * ���� Ÿ�� ��ȯ�� ����� ���� ������ ���� �ִ�.
		 * �������� Ÿ���� �޾Ƶ��� �� ���� ������ ���� ������
		 * ������ ������ �����͸� �����մϴ�.
		 * (overflow, underflow)
		 */
		int k = 4400;
		System.out.println("�� ��ȯ��:>" + k);
		byte b = (byte)k;
		System.out.println("���� �� ��ȯ��:>" + b);
	}

}
