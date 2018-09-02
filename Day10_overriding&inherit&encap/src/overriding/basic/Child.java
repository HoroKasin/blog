package overriding.basic;

public class Child extends Parent {
	
	void method2() {
		System.out.println("재정의된 2번 메서드 호출!");
	}
	void method3() {
		System.out.println("자식의 3번 메서드 호출!");
	}
}
