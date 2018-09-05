package Switch;

public class SwitchExample2 {

	public static void main(String[] args) {

		String[] greetings = {"hello", "안녕", "nihao", "konnichiwa"
				, "wago"};
		System.out.println("Length of array:>" + greetings.length);
		
		int i = (int)(Math.random() * greetings.length);
		System.out.println("Selected Words:>" + greetings[i]);
		
		switch(greetings[i]) {
		
		case "hello":
			System.out.println("the English language!"); break;
			
		case "안녕":
			System.out.println("Korean!!"); break;
		
		case "nihao":
			System.out.println("Chinese!!"); break;
			
		case "konnichiwa":
			System.out.println("the Japanese language !!"); break;
		
		default:
			System.out.println("What language??...");
		}

		
	}
}


