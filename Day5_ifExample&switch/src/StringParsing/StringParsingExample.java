package StringParsing;

public class StringParsingExample {

	public static void main(String[] args) {
		
		String s1 = "20";
		String s2 = "30";
		
		System.out.println(s1 + s2);
		
		/*
		 * 문자열 데이터를 기본데이터로 치환하려면
		 * 파싱 메서드를 사용해야 합니다.
		 * - String -> int로 변환
		 * Integer.parseInt(문자열)
		 * - String -> double로 변환
		 * Double.parseDouble(문자열)
		 * - 주의사항: 변환 전 문자열 내부데이터가 정수, 실수
		 * 형태가 아닌 경우에는 에러가 발생함.
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






