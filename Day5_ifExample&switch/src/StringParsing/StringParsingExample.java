package StringParsing;

public class StringParsingExample {

	public static void main(String[] args) {
		
		String s1 = "20";
		String s2 = "30";
		
		System.out.println(s1 + s2);
		
		/*
		 * ���ڿ� �����͸� �⺻�����ͷ� ġȯ�Ϸ���
		 * �Ľ� �޼��带 ����ؾ� �մϴ�.
		 * - String -> int�� ��ȯ
		 * Integer.parseInt(���ڿ�)
		 * - String -> double�� ��ȯ
		 * Double.parseDouble(���ڿ�)
		 * - ���ǻ���: ��ȯ �� ���ڿ� ���ε����Ͱ� ����, �Ǽ�
		 * ���°� �ƴ� ��쿡�� ������ �߻���.
		 */
//		Integer.parseInt("hello");
		
		int n1 = Integer.parseInt(s1);//"20"->20
		int n2 = Integer.parseInt(s2);
		
		System.out.println(n1 + n2);
		
		double d1 = Double.parseDouble("3.14");
		double d2 = Double.parseDouble("6.62");
		System.out.println(d1 + d2);
		
	}

}






