package inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "ȫ�浿";
		p.age = 34;
		System.out.println(p.getInfo());
		
		Student s = new Student();
		s.studentId = "20181112312";
		s.name = "�̼���";
		s.age = 19;
		System.out.println(s.getInfo());
		
		Teacher t = new Teacher();
		t.subject = "����";
		t.name = "�Ż��Ӵ�";
		t.age = 43;
		System.out.println(t.getInfo());
		
		Employee e = new Employee();
		e.department = "������";
		e.name = "�庸��";
		e.age = 44;
		System.out.println(e.getInfo());
		

	}

}




