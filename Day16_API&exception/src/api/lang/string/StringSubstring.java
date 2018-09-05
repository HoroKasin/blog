package api.lang.string;

public class StringSubstring {

	public static void main(String[] args) {

		String ssn = "991234-1234987";
		
		/*
		 * Method to truncate all strings before index No. 7 in string.
		 */
		String last = ssn.substring(7);
		System.out.println(last);
		
		/*
		 * Index &gt;= 0 (including)
		 * Method to cut the rest leaving a string
		 */
		String first = ssn.substring(0, 6);
		System.out.println(first);
	}

}
