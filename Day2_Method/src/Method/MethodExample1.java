package Method;

public class MethodExample1 {
	
	/*
	 * 1. �޼���� �����ϴ� ������ ȣ���ϴ� ������ �ֽ��ϴ�.
	 * 2. �����ϴ� ������ �޼��带 ����� �����̸� �ش� �޼�����
	 *    ����� ���ϰ� �޼��� ������ ���� �ʿ��� �Էµ����͸�
	 *    ó���� �� �ִ� �Ű� ������ �����ϸ� ����� �������� Ÿ��
	 *    ���� �����ϰ� ���� ������ �ۼ��մϴ�.
	 * 3. ȣ���ϴ� ������ �޼��带 ����ϴ� �����̸� �ش� �޼��尡
	 *    �ʿ���ϴ� �Ű���(�Է°�)�� �޼��忡 �����ϸ鼭
	 *    �Է°��� ���� ó���� �����(��°�)�� ��ȯ�޽��ϴ�.
	 * 4. �޼����� ������ �޼��� ���ο����� �� �� �����ϴ�.
	 *    �ݵ�� �޼��� �ۿ��� �����ؾ� �մϴ�.
	 * 5. �޼��� ���ο����� �޼����� ȣ�⸸ �����մϴ�.        
	 */

	public static void main(String[] args) {
		
		//�޼����� ȣ��
		greeting();
		luckyNumber(57);
		
		//��ȯ ����(���� Ÿ��)�� �ִ� �޼���� ��ȯ����
		//������� ������ �����ؾ߸� ����� �� �ֽ��ϴ�.
		String addr = getAddress();
		System.out.println("���ּ�: " + addr);
		
		String info = petsInfo("����", "û����");
		System.out.println(info);
		
	}//���θ޼����� ���κ�
	
	//1. input�� output�� �� �� ���� �޼��� ����.
	static void greeting() {
		System.out.println("�ȳ��ϼ���?");
		System.out.println("�ݰ����ϴ�.");
	}
	
	//2. input�� �ְ� output�� ���� �޼���
	static void luckyNumber(int number) {
		System.out.println("����� ���ڴ�: " + number);
	}
	
	//3. input�� ���� output�� �����ϴ� �޼���
	static String getAddress() {
		String address = "����� ������";
		/*
		 * output�� �ִ� �޼���� �ݵ�� return�̶��
		 * Ű���带 ����Ͽ� ���� ��ȯ(����)�ؾ� �մϴ�.
		 * ��ȯ���� �ִ� �޼���� return�� ������ ����
		 * ����Ǿ� ȣ��η� �̵��մϴ�.
		 * �׷��� return�Ʒ��� �ڵ带 �ۼ��� �� �����ϴ�.
		 */
		return address;
	}
	
	//4. input�� output�� ���ÿ� �����ϴ� �޼���
	static String petsInfo(String pet1, String pet2) {
		String petInfo = pet1 + "�� " + pet2;
		return petInfo;
	}
}









