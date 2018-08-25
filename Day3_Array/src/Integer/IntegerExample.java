package Integer;

public class IntegerExample {

	public static void main(String[] args) {

		byte a = -127;
		short b = 32767;
		int c = 2147483647;
		long d = 2147483648L;
		
		System.out.println(d);
		
		//2������ ������ ���� �����տ� 0b�� ���δ�.
		int bin = 0b1010;
		
		//8������ ������ ���� �����տ� 0�� ���δ�.
		int octa = 064;
		
		//16������ ������ ���� ���� �տ� 0x�� ���δ�.
		int hexa = 0xa4b;
		
		System.out.println("2���� 1010>" + bin);
		System.out.println("8���� 64>" + octa);
		System.out.println("16���� 3a4b>" + hexa);
	}

}
