package StringParsing;

public class StringParsingExample {

	public static void main(String[] args) {
		
		String s1 = "20";
		String s2 = "30";
		
		System.out.println(s1 + s2);
		
		/*
		 * To replace string data with default data
		 * Parsing method must be used
		 * - String -> convert to int
		 * Integer.parseInt
		 * - String -> Convert to Double
		 * Double.parseDouble
		 * - Caution: internal data in string before conversion is integer, error
		 * An error is generated if it is not in shape.
		 */
//		Integer.parseInt("hello");
		
		int n1 = Integer.parseInt(s1);//"20"->20
		int n2 = Integer.parseInt(s2);
		
		System.out.println(n1 + n2);
		
		double d1 = Double.parseDouble("3.14");
		double d2 = Double.parseDouble("6.62");
		System.out.println(d1 + d2);
		
	}

}






