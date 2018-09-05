package inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		//The interface cannot create an object.
//		Inter1 i1 = new Inter();
		
		InterClass ic = new InterClass();
		
		System.out.println(ic.INCH);
		System.out.println(Inter2.ABC);
		
		ic.method1();
		ic.method2();
		ic.method3();
		
		// treat interface as data type
		//promotion concept
		//Interface enables versatility without inheritance
		Inter1 it1 = new InterClass();
		Inter2 it2 = new InterClass();
		
		System.out.println(it1.INCH);
		
		//1.If multi-formality is implemented with  인터페이staff, the interface
		// Only the constants and methods provided can be used
		//2. Members of other interfaces simultaneously implemented cannot be referenced.
		//3. If forced type conversion is used to solve this problem,
		// gain access to members of different interfaces and implementation classes
		it1.method1();
		
		InterClass icc = (InterClass)it1;
		icc.method1();
		icc.method2();
		icc.method3();
	}

}




