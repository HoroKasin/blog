package overriding.person;

public class Person {
	
	String name;
	int age;
	
	String getInfo() {
		return "이름: " + name + ", 나이: " + age;
	}
}
