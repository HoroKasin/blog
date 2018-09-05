package exception.trycatch;

public class TryCatchExample1 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		System.out.println(i * j);
		
		try {
			System.out.println(i / j);
			System.out.println("If an exception occurs, "
					+ "this sentence cannot be viewed.");
		} catch(Exception e) {
			System.out.println("Cannot divide by 0.");
		}
		
		System.out.println(i + j);
		System.out.println(i - j);

	}

}







