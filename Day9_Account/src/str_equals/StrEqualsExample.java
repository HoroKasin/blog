package str_equals;

public class StrEqualsExample {

	public static void main(String[] args) {
		
		String str1 = "Logic";
		String str2 = "Logic";
		
		if(str1 == str2) {
			System.out.println("Str1 and str2 have the same address value.");
		}else {
			System.out.println("Str1 and str2 have different address values.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("Str1 and str2 have the same address value.");
		}else {
			System.out.println("Str1 and str2 have different address values.");
		}
		
		String str3 = new String("Nijin");
		String str4 = new String("Nijin");
		
		System.out.println(str3 == str4);
		
		if(str3 == str4) {
			System.out.println("Str3 and str4 have the same address value.");
		}else {
			System.out.println("Str3 and str4 have different address values.");
		}
		
		if(str3.equals(str4)) {
			System.out.println("Str3 and str4 have the same address value.");
		}else {
			System.out.println("Str3 and str4 have different address values.");
		}

	}

}



