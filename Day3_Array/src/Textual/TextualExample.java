package Textual;

public class TextualExample {

	public static void main(String[] args) {
	
		//���Ϲ��ڸ� ������ �� �ִ� char
		char c1 = 'A';
		char c2 = '\uAC00'; //�ѱ� '��'�� �ش��ϴ� �����ڵ� 
		char c3 = 66; //'b'�� �����ڵ尪 16������ 10������ ��ȯ�� ��
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		////���ڿ��� ������ �� �ִ� String
		String s1 = "my name is 000";
		String s2 = "computer hanashi desu";
		
		System.out.println(s1 + s2);
		
		//���ڿ� �ٸ� ������ Ÿ�� + ����
		System.out.println("-----------------");
		System.out.println(100 + 200);
		System.out.println(100 + "200");
		System.out.println(10 + 20 + "hello");
		System.out.println("hello" + 10 + 20);
		System.out.println('A' + 10);
	
	}

}
