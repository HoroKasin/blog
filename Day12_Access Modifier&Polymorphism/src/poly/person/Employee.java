package poly.person;

public class Employee extends Person {
	
	String department;
	
	Employee(String name, int age, String department) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.department = department;
	}
	
	String getInfo() {
		return super.getInfo()
				+ ", department: " + department;
	}
}
