package poly.instanceof_.person;

public class Employee extends Person {
	
	String department;
	
	Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	String getInfo() {
		return super.getInfo()
				+ ", department: " + department;
	}
}
