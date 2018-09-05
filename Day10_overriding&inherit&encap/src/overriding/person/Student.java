package overriding.person;

public class Student extends Person {
	
	String studentId;
	
	String getInfo() {
		return "name : " + name 
				+ ", age: " + age 
				+ ", studentId: " + studentId;
	}
}















