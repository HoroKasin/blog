package str_equals;

public class StrEqualsExample {

	public static void main(String[] args) {
		
		String str1 = "����";
		String str2 = "����";
		
		if(str1 == str2) {
			System.out.println("str1�� str2�� �ּҰ��� ����.");
		}else {
			System.out.println("str1�� str2�� �ּҰ��� �ٸ���.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1�� str2�� ���ڿ��� ����.");
		}else {
			System.out.println("str1�� str2�� ���ڿ��� �ٸ���.");
		}
		
		String str3 = new String("����");
		String str4 = new String("����");
		
		System.out.println(str3 == str4);
		
		if(str3 == str4) {
			System.out.println("str3�� str4�� �ּҰ��� ����.");
		}else {
			System.out.println("str3�� str4�� �ּҰ��� �ٸ���.");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3�� str4�� ���ڿ��� ����.");
		}else {
			System.out.println("str3�� str4�� ���ڿ��� �ٸ���.");
		}

	}

}



