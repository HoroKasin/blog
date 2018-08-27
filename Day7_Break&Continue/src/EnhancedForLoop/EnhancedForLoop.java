package EnhancedForLoop;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String[] week = {"일", "월", "화", 
				"수", "목", "금", "토"};
		
		for(String day : week) {
			System.out.println(day + "요일");
		}
		
		System.out.println("---------------------");
		
		int[] scores = {95, 71, 84, 99, 83};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("점수 총점: " + sum + "점");
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균: " + avg + "점");

	}

}
