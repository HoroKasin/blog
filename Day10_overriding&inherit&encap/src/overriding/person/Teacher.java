package overriding.person;

public class Teacher extends Person {
	
	String subject;
	
	String getInfo() {
		return "이름: " + name 
				+ ", 나이: " + age 
				+ ", 과목: " + subject;
	}
}
