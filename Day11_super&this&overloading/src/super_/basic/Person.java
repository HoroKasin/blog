package super_.basic;

public class Person {
	
	private String name;
	private int age;
	
	//overloading
	Person() {
		this("Nameless", 1);
	}
	
	Person(String name) {
		this(name, 1);
	}
	
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	String getInfo() {
		return "¿Ã∏ß: " + name + ", age: " + age;
	}
}








