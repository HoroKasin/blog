package Conditional;

public class ConditionalExample {

	public static void main(String[] args) {

		//난수를 발생시키는 메서드 random()
		//random() 메서드 0.0이상 1.0미만의 난수를 발쌩
		double d = Math.random() * 10; // 0 ~ 10
		System.out.println(d);
		System.out.println("==================");
		
		//1이상 10이하 난수 발생시키기
		int i = (int)d + 1; //[0+1] = 1 ~ 10
		System.out.println(i);
		System.out.println("==================");
		
		// -4 ~ 5 까지의 정수 난수 발생시키기
		int j = 5 - (int)(Math.random() * 10); // 1 - 5 = -4 : 10 - 5 = 5
		System.out.println("랜던값!!!:>" + j);
		System.out.println("==================");
		
		//3항 조건연산자 (조건식 ? 연산식1 : 연산식2)
		int abc = (i >= 0) ? i : -i;
		System.out.println(i + "의 절대값은:>" + abc);
		
	}

}
