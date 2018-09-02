package this_.basic;

public class Student extends Person {
	
	String studentId;
	
	Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	String getInfo() {
		return "name: " + name + ", age: " + age
				+ ", studentId: " + studentId;
	}

}






