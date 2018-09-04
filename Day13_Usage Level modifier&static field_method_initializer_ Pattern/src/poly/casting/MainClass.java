package poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.var1 = "qq";
		c1.var2 = "ee";
		c1.method1();
		c1.method2();
		c1.method3();
		
		//You do not have access to your child's 
		//original membership when applying protection.
		Parent p = new Child();
		p.var1 = "qq";
		
		p.method1();
		p.method2();
		
		//using rigid type conversion
		//Refer to your original child object member.
		Child c = (Child)p;
		c.var2 = "ee";
		c.method3();
		
		
		Child c2 = new Child();

		System.out.println("-----------");
		System.out.println(p);
		System.out.println(c);
		System.out.println(c2);
		

	}

}






