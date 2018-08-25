package Textual;

public class TextualExample {

	public static void main(String[] args) {
	
		//단일문자를 저장할 수 있는 char
		char c1 = 'A';
		char c2 = '\uAC00'; //한글 '가'에 해당하는 유니코드 
		char c3 = 66; //'b'의 유니코드값 16진수를 10진수로 변환한 값
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		////문자열을 저장할 수 있는 String
		String s1 = "my name is 000";
		String s2 = "computer hanashi desu";
		
		System.out.println(s1 + s2);
		
		//문자와 다른 데이터 타입 + 연산
		System.out.println("-----------------");
		System.out.println(100 + 200);
		System.out.println(100 + "200");
		System.out.println(10 + 20 + "hello");
		System.out.println("hello" + 10 + 20);
		System.out.println('A' + 10);
	
	}

}
