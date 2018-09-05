package api.lang.string;

public class StringLowerUpper {

	public static void main(String[] args) {
		
		String str1 = "java programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lower = str1.toLowerCase();
		String upper = str2.toUpperCase();
		
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(lower.equals(upper));
		
		/*
		 * Among string comparison methods, eqialsIgnoreCase() shows:
		 * If the alphabet is the same regardless of the case
		 * Returns true
		 */
		System.out.println(lower.equalsIgnoreCase(upper));
	}
}
