package overriding.person;

public class Employee extends Person {
	
	String department;
	
	String getInfo() {
		return "이름: " + name 
				+ ", 나이: " + age 
				+ ", 부서: " + department;
	}
}
