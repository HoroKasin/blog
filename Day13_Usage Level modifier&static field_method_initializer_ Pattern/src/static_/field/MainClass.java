package static_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		
		c1.a++;
		c1.b++;//static field
		
		System.out.println("Generic member variable a: " + c1.a);
		System.out.println("Static member variable b: " + c1.b);
		
		Count c2 = new Count();
		
		c2.a++;
		c2.b++;
		
		System.out.println("Generic member variable a: " + c2.a);
		System.out.println("Static member variable b: " + c2.b);
		
		System.out.println(c1.b);
		
		/*
		* The static members (variables, messages are 
		* independent of the object.
		* Can be used only with class names
		*  without having to create objects.
		 */
		Count.b++;
		Count.b++;
		Count.b++;
		System.out.println(c1.b);
		System.out.println(c2.b);
		System.out.println(Count.b);
	}

}



