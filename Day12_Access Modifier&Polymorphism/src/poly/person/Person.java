package poly.person;

public class Person {
	
	private String name;
	private int age;
	
	
	Person(String name) {
		this(name, 1);
	}
	
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	String getInfo() {
		return "name: " + name + ", age: " + age;
	}
}








