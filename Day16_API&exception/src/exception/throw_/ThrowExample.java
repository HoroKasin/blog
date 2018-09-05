package exception.throw_;

public class ThrowExample {
	
	//Method declaration to obtain cumulative sum from 1 to n positive.
	public static int calcSum(int n) throws Exception {
		
		if(n < 0) {
			
			/*
			 * Throwkeyward forced exceptions in code
			 * As soon as you meet a slow
			 * Search.
			 */
			
			throw new Exception("Please deliver the "
					+ "parameter in positive numbers.");
		}
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		try {
			int result1 = calcSum(10);
			System.out.println("Cumulative sum from 1 to 10: " + result1);
		
			int result2 = calcSum(-5);
			System.out.println("Cumulative sum from 1 to 5: " + result2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}




