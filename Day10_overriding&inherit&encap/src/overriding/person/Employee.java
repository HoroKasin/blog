package overriding.person;

public class Employee extends Person {
	
	String department;
	
	String getInfo() {
		return "�̸�: " + name 
				+ ", ����: " + age 
				+ ", �μ�: " + department;
	}
}
