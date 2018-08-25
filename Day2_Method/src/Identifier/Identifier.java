package Identifier;

public class Identifier {

	public static void main(String[] args) {
		
		//자바는 식별자 이름을 지을 때 대/소문자를 구분합니다.
		int age = 27;
		int Age = 28;
		int aGE = 29;
		System.out.println(age);
		System.out.println(Age);
		
		//식별자이름을 숫자로 시작하면 안됩니다.
//		int 4number = 4; (X)//컨트롤 + / 빠른주석처리
		int number4 = 4;
		int num4ber = 4;
		
		//식별자이름에는 공백이 들어가선 안됩니다.
//		int phone number = 12345678; (X)
		int phoneNumber = 12345678;
		
		//키워드는 식별자로 사용 불가능
//		int if = 4;
//		int while = 4;
	}
}






