package this_.basic;

public class Person {
	
	String name;
	int age;
	
	//overloading
	Person() {
		this("NAME x", 1);
	}
	
	Person(String name) {
		this(name, 1);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String getInfo() {
		return "name: " + name + ", age: " + age;
	}
}








