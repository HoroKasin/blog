package While_.Basic;

public class WhileExample1 {

	public static void main(String[] args) {

		// 1 ~ 10������ ���� ���� ���ϴ� ���
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++; //����� ������ ���ؼ� �ݺ����� �����Ű�� ���ؼ� ��� 
		}
		System.out.println("1���� 10������ ����:>" + sum);
	}

}
