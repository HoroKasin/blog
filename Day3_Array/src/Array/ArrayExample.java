package Array;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		// 1. �迭�� ����
		char[] letters; 
		
		// 2. �迭�� ����
		letters = new char[4];
		
		// 3. �迭�� �ʱ�ȭ
		// ������ �ε����� �����Ͽ� �����͸� ������.
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 68;
		
		// 4. �迭�� �� ����( ���  )
		System.out.println("�迭�� 3��° �������� ��:>" + letters[2] );

		/*
		 * �迭 ���ο� ����ִ� �����͵��� ���ڿ� ���·� �Ѵ���
		 * Ȯ���غ����� ��¹� println()�� �Ű������� 
		 * Arrays.toString(�迭������)�� ���ָ� �˴ϴ�.
		 */
		System.out.println("������ �����͸� ���ڿ� ���·� ����:>" + Arrays.toString(letters));
	}

}
