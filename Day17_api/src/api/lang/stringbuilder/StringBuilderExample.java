package api.lang.stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		// Method append to end text
		sb.append("Java ");
		System.out.println(sb);
		
		sb.append("Program Study");
		System.out.println(sb);
		
		//method insert character into index()
		sb.insert(12, "ming");
		System.out.println(sb);
		sb.insert(4, "2");
		System.out.println(sb);
		
		//Replace a method to replace text()
		sb.replace(6, 17, "Book");
		System.out.println(sb);
		
		//Delete method to delete text()
		sb.delete(4, 5);
		System.out.println(sb);
		
		sb.delete(4, 9);
		System.out.println(sb);
		
		System.out.println("Total Characters: " + sb.length());

	}

}



