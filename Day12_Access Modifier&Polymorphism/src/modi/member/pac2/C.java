package modi.member.pac2;

import modi.member.pac1.A;

public class C {
	
	public C() {
		A a = new A();
		
		a.var1 = 1; //public (O)
//		a.var2 = 2; //p.f (X)
//		a.var3 = 3; //private(X)
		
		a.method1(); //(O)
//		a.method2(); //(X)
//		a.method3(); //(X)
		
	}
}


