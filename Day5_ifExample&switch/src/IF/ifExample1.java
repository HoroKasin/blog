package IF;

public class ifExample1 {

	public static void main(String[] args) {

		// 0 ~ 100������ ������ ������ �߻���Ű��
		int point = (int)(Math.random() * 101);
		System.out.println("����:>" + point);
		
		if(point >= 60) {
			System.out.println("60���̻�!!!");
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("60�����ϤФ�");
			System.out.println("���հ��Դϴ�.");
		}
		System.out.println("�����ϼ̽��ϴ�.!@");
	}

}
