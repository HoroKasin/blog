package Switch;

public class SwitchExample2 {

	public static void main(String[] args) {

		String[] greetings = {"hello", "�ȳ�", "nihao", "konnichiwa"
				, "wago"};
		System.out.println("�迭�� ����:>" + greetings.length);
		
		int i = (int)(Math.random() * greetings.length);
		System.out.println("���õ� �ܾ�:>" + greetings[i]);
		
		switch(greetings[i]) {
		
		case "hello":
			System.out.println("����!"); break;
			
		case "�ȳ�":
			System.out.println("�ѱ���!!"); break;
		
		case "nihao":
			System.out.println("�߱���!!"); break;
			
		case "konnichiwa":
			System.out.println("�Ϻ���!!"); break;
		
		default:
			System.out.println("��������ϱ�?...");
		}

		
	}
}


