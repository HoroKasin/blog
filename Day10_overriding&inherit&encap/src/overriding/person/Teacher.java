package overriding.person;

public class Teacher extends Person {
	
	String subject;
	
	String getInfo() {
		return "�̸�: " + name 
				+ ", ����: " + age 
				+ ", ����: " + subject;
	}
}
