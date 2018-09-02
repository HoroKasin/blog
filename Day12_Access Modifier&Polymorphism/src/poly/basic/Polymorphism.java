package poly.basic;

/*
 * In Java, you can declare multiple classes within a class file.
 * However, a class with the same name as the file name must exist.
 */
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Polymorphism {
	
	/*
	 * Multiformity is a trait that allows a child to have parenting.
	 * That is, child objects can be stored in parent type variables at any time.
	 */
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = new B(); //The object B is provisioned and stored in type A.
	A a2 = new C();
	A a3 = b;
	A a4 = d;
	A a5 = new E();
	
	B b1 = d;
	C c1 = new E();
	
	Object o1 = a;
	Object o2 = b;
	Object o3 = new C();

}











