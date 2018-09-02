package this_.basic;

public class Teacher extends Person {

	String subject;
	
	Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	String getInfo() {
		return "name: " + name + ", age: " + age
				+ ", subject: " + subject;
	}
}
