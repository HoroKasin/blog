package overriding.person;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "Hong Gil Dong";
		p.age = 34;
		System.out.println(p.getInfo());
		
		Student s = new Student();
		s.studentId = "20181112312";
		s.name = "General Lee";
		s.age = 19;
		System.out.println(s.getInfo());
		
		Teacher t = new Teacher();
		t.subject = "mathematics";
		t.name = "Shin Saimdang";
		t.age = 43;
		System.out.println(t.getInfo());
		
		Employee e = new Employee();
		e.department = "Sales department";
		e.name = "Jang Bogo";
		e.age = 44;
		System.out.println(e.getInfo());
		

	}

}




