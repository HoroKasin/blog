package overriding.person;

public class Teacher extends Person {
	
	String subject;
	
	String getInfo() {
		return "name: " + name 
				+ ", age: " + age 
				+ ", subject: " + subject;
	}
}
