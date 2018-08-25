package IF;

public class ifExample1 {

	public static void main(String[] args) {

		// 0 ~ 100까지의 정수형 난수를 발생시키기
		int point = (int)(Math.random() * 101);
		System.out.println("점수:>" + point);
		
		if(point >= 60) {
			System.out.println("60점이상!!!");
			System.out.println("합격입니다.");
		}else {
			System.out.println("60점이하ㅠㅠ");
			System.out.println("불합격입니다.");
		}
		System.out.println("수고하셨습니다.!@");
	}

}
