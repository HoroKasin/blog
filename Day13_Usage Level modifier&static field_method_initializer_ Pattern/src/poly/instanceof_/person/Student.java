package poly.instanceof_.person;

public class Student extends Person {
	
	String studentId;
	
	Student(String name, int age) {
		this(name, age, "1234");		
	}
	
	Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	String getInfo() {
		return super.getInfo()
				+ ", studentId: " + studentId;
	}

}






