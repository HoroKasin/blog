package exception.multicatch;

public class MultiCatchExample2 {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];			
						
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			
			int result = val1 + val2;
			
			System.out.println(val1 + " + " + val2 + " = " + result);
			
			
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Insufficient number of run parameters or "
					+ "conversion to numbers is not possible.");
			System.out.println("Add more than one value for the"
					+ " command line factor and integer.");
		} catch(Exception e) {
			System.out.println("Other exceptions.");
		} finally {
			System.out.println("Please run it again.");
		}

	}

}




