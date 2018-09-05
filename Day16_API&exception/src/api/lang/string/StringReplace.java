package api.lang.string;

public class StringReplace {

	public static void main(String[] args) {

		
		String day1 = "2018-09-06";
		
		String day2 = day1.replace("-", "/");
		System.out.println(day2);
		System.out.println(day1);
	}

}
