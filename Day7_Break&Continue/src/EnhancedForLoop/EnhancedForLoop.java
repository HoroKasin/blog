package EnhancedForLoop;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String[] week = {"Sunday", "Monday", "Tuesday", 
				"Wednesday", "Thursday", "Friday", "Saturday"};
		
		for(String day : week) {
			System.out.println(day + "Day");
		}
		
		System.out.println("---------------------");
		
		int[] scores = {95, 71, 84, 99, 83};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("Total score: " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("Score mean: " + avg);

	}

}
