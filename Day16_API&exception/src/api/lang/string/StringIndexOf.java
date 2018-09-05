package api.lang.string;

public class StringIndexOf {

	public static void main(String[] args) {

		String subject = "Java programming";
		
		int location = subject.indexOf("P");
		System.out.println(location);
		
		if(subject.indexOf("Python") != -1) {
			System.out.println("Words related to Java.");
		}else {
			System.out.println("The word is not related to Java.");
		}
	}

}
