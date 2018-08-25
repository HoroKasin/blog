package Logical;

public class LogicalExample1 {

	public static void main(String[] args) {

		//같은 타입의 변수를 선언할 때는 콤마(,)로 나열이 가능
		int x = 10, y = 20;
		
		//if뒤에 조건식의 결과가 true면 if 블록 내부의 코드를 실행
		//false면 else블록 내부의 코드를 실행
		
		if((x != 10) & (++y ==21)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println("x:>" + x + ", y:>" + y);
	}

}
