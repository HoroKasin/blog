package For.Basic;

public class ForQUuiz {

	public static void main(String[] args) {

		// 2 ~ 9������ ������ ���� �� �������� �������� ��µǴ� ���
		
		int dan = (int)(Math.random() * 8) + 2;
		
		System.out.println("���� ������ " + dan + "��");
		System.out.println("-------------");
		for(int i = 1; i <= 9; i ++) {
			System.out.println(dan + " x " + i + " = " + dan * i);
		}
	}

}
