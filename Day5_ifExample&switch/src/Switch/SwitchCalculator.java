package Switch;


public class SwitchCalculator {

	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.println("A calculator that calculates two numbers.");
			System.out.println("ex: 5 x 4");
			return; 
		}
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[2]);
		
		switch(args[1]) {
		
		case "+":
			System.out.println("a double sum: " + (n1 + n2));
			break;
		case "-":
			System.out.println("Two subtractions are: " + (n1 - n2));
			break;
		case "x":
			System.out.println("The two multiplication: " + (n1 * n2));
			break;
		case "/":
			System.out.println("Two divisions: " + (n1 / n2));
			break;
		}

	}

}

