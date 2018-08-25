package Array;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		// 1. �迭�� ����
		char[] letters;
		
		// 2. �迭�� ����
		// �迭�� ������ ũ�⸦ �����, �ѹ� ������ ũ��� ���� �Ұ����ϴ�.
		letters = new char[4];
		
		// 3. �迭�� �ʱ�ȭ
		// �� �ε����� �����Ͽ� �����͸� ������.
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 78;
		
		// 4. �迭�� �� ���� (���)
		System.out.println("�迭�� 3��° �������� ��:>" + letters[2]);
		
		System.out.println("=============================");
		
		/*
		 * �迭 ���ο� ����ִ� �����͵��� ���ڿ� ���·� �Ѵ���
		 * Ȯ���غ����� ��¹� println()�� �Ű������� 
		 * Arrays.toString(�迭������)�� ���ָ� �˴ϴ�.
		 */
		System.out.println(Arrays.toString(letters));
		
		System.out.println("=============================");
		
		//�迭�� ����� ����, �ʱ�ȭ�� ���ÿ� �ϴ� ���.
		byte[] bArr = new byte[5];
		int[] iArr = new int[] {4, 6, 8, 10};
		
		String[] sArr = {"hello", "my", "name", "is"};
		
		System.out.println(Arrays.toString(bArr));
		System.out.println(Arrays.toString(iArr));
		System.out.println(Arrays.toString(sArr));
	
	}
	

}
