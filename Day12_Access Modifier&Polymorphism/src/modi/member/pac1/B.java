package modi.member.pac1;

public class B {
	
	public B() {
		
		A a = new A();
		
		a.var1 = 1; //public (O)
		a.var2 = 2; //p.f (O)
//		a.var3 = 3; //private (X)
		
		a.method1();//public (O)
		a.method2();//p.f (O)
//		a.method3();//private (X)
	}
}




