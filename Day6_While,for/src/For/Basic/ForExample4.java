package For.Basic;

public class ForExample4 {

	public static void main(String[] args) {

		// 1 ~100������ ���� �� 8�� ����̸鼭 ���ÿ� 16�� ����� �ƴ� ���� ��� ���
		for(int i = 1; i <=100; i++) {
			if(i % 8 == 0 & i % 16 != 0) {
				System.out.print(i + " ");
			}
		}
	}

}
