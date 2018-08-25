package Switch;

public class SwitchExample2 {

	public static void main(String[] args) {

		String[] greetings = {"hello", "안녕", "nihao", "konnichiwa"
				, "wago"};
		System.out.println("배열의 길이:>" + greetings.length);
		
		int i = (int)(Math.random() * greetings.length);
		System.out.println("선택된 단어:>" + greetings[i]);
		
		switch(greetings[i]) {
		
		case "hello":
			System.out.println("영어!"); break;
			
		case "안녕":
			System.out.println("한국어!!"); break;
		
		case "nihao":
			System.out.println("중국어!!"); break;
			
		case "konnichiwa":
			System.out.println("일본어!!"); break;
		
		default:
			System.out.println("무슨언어일까?...");
		}

		
	}
}


