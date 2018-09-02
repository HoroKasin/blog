package inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "홍길동";
		p.age = 34;
		System.out.println(p.getInfo());
		
		Student s = new Student();
		s.studentId = "20181112312";
		s.name = "이순신";
		s.age = 19;
		System.out.println(s.getInfo());
		
		Teacher t = new Teacher();
		t.subject = "수학";
		t.name = "신사임당";
		t.age = 43;
		System.out.println(t.getInfo());
		
		Employee e = new Employee();
		e.department = "영업부";
		e.name = "장보고";
		e.age = 44;
		System.out.println(e.getInfo());
		

	}

}




