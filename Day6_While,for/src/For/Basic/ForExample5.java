package For.Basic;

public class ForExample5 {

	public static void main(String[] args) {

		//1 ~ 100������ ���� �� 9�� ����� ������ ����ϼ���.
		int count = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 9 == 0) {
				count++; //i�� 9�� ������ ������ ī���Ͱ� 1������
				System.out.print(i + " \n");
			}
		}
		System.out.println("9�� ����� ����:> " + count);
	}

}
