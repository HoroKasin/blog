package Bit;

public class BitNotExample {

	public static void main(String[] args) {

		//��Ʈ���� ������(~)
		//������ ���� 2������ ǥ���Ͽ� �� �ڸ����� ���� ������Ų��.
		//	0 -> 1,      1 -> 0
		
		byte b = 8; //0000 1000
		System.out.println(~b);//1111 0111
		System.out.println("=============");
		
		//������ ������(!)
		// true -> false,    false -> true
		boolean bool = false;
		System.out.println(!bool);
		System.out.println("=============");
		
		//��ġ ����
		int i = 7 / 3;
		int k = 7 % 3;
		System.out.println("7���� 3�� ���� ����:>" + i);
		System.out.println("7���� 3�� ���� ��������:>" + k);
		System.out.println("=============");
		
		//�񱳿���
		System.out.println(i == k);
		System.out.println(k < i);
	}

}
