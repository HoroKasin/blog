package static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		s1.setI(300);
		System.out.println("s1.i = " + s1.getI());
		
		s2.setI(500);
		System.out.println("s2.i = " + s2.getI());
		System.out.println("s1.i = " + s1.getI());
		
		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);
	}

}




