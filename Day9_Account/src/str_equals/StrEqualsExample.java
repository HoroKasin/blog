package str_equals;

public class StrEqualsExample {

	public static void main(String[] args) {
		
		String str1 = "루피";
		String str2 = "루피";
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 주소값이 같다.");
		}else {
			System.out.println("str1과 str2는 주소값이 다르다.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2의 문자열이 같다.");
		}else {
			System.out.println("str1과 str2의 문자열이 다르다.");
		}
		
		String str3 = new String("쵸파");
		String str4 = new String("쵸파");
		
		System.out.println(str3 == str4);
		
		if(str3 == str4) {
			System.out.println("str3과 str4는 주소값이 같다.");
		}else {
			System.out.println("str3과 str4는 주소값이 다르다.");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 문자열이 같다.");
		}else {
			System.out.println("str3과 str4는 문자열이 다르다.");
		}

	}

}



