package this_.basic;

public class Employee extends Person {
	
	String department;
	
	Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	String getInfo() {
		return "name: " + name + ", age: " + age
				+ ", Department: " + department;
	}
}
