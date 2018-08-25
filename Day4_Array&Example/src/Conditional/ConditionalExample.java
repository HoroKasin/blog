package Conditional;

public class ConditionalExample {

	public static void main(String[] args) {

		//������ �߻���Ű�� �޼��� random()
		//random() �޼��� 0.0�̻� 1.0�̸��� ������ �߽�
		double d = Math.random() * 10; // 0 ~ 10
		System.out.println(d);
		System.out.println("==================");
		
		//1�̻� 10���� ���� �߻���Ű��
		int i = (int)d + 1; //[0+1] = 1 ~ 10
		System.out.println(i);
		System.out.println("==================");
		
		// -4 ~ 5 ������ ���� ���� �߻���Ű��
		int j = 5 - (int)(Math.random() * 10); // 1 - 5 = -4 : 10 - 5 = 5
		System.out.println("������!!!:>" + j);
		System.out.println("==================");
		
		//3�� ���ǿ����� (���ǽ� ? �����1 : �����2)
		int abc = (i >= 0) ? i : -i;
		System.out.println(i + "�� ���밪��:>" + abc);
		
	}

}
