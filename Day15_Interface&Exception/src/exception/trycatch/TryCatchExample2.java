package exception.trycatch;

public class TryCatchExample2 {

	public static void main(String[] args) {
		
		String[] greetings = {"hello", "hi", "NIHAO"};
		
		int i = 0;
		
		while(i < 4) {
			try {
				System.out.println(greetings[i]);
			}catch(Exception e) {
				System.out.println("The reference range of the array "
						+ "is out of range.");
			}finally {
				System.out.println("This statement is printed regardless"
						+ " of whether an error occurred.");
			}
			i++;
		}
		System.out.println("Program normal shutdown.");

	}

}





