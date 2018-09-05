package api.lang.stringbuilder;

public class StringTest {

	public static void main(String[] args) {
		
		long start, end;
		
		start = System.currentTimeMillis();
		
		String str = "A";
		for(int i=0; i<300000; i++) {
			str += "A";
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("String: " + (end-start) + "ms");
		
		start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder("A");
		
		for(int i=0; i<300000; i++) {
			sb.append("A");
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("StringBuilder: " + (end-start) + "ms");

	}

}





