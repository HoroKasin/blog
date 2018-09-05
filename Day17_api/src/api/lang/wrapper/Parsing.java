package api.lang.wrapper;

public class Parsing {

	public static void main(String[] args) {
		
		String s1 = "10";
		String s2 = "15.55";
		
		int a = Integer.parseInt(s1);
		double b = Double.parseDouble(s2);
		float c = Float.parseFloat("4.18");
		
		System.out.println(a * b * c);

	}

}
