package While_.Basic;

public class WhileExample1 {

	public static void main(String[] args) {

		// 1 ~ 10까지의 누적 합을 구하는 방법
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++; //제어변수 조작을 통해서 반복문을 종료시키기 위해서 사용 
		}
		System.out.println("1부터 10까지의 합은:>" + sum);
	}

}
