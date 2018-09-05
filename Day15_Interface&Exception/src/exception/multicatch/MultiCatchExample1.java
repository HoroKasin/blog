package exception.multicatch;

public class MultiCatchExample1 {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			String str = null;
			str.length();
			
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			
			int result = val1 + val2;
			
			System.out.println(val1 + " + " + val2 + " = " + result);
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Insufficient number of run parameters.");
			System.out.println("Add more than one value for the command-line factor.");
		} catch (NumberFormatException e) {
			System.out.println("Cannot convert string to number.");
			System.out.println("Adds an integer to the command-line factor value.");
		} catch (Exception e) {
			System.out.println("Other exceptions are handled here.");
		}

	}

}


