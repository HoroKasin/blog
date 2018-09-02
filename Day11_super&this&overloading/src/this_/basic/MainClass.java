package this_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person("Hong gi dong");
		Person p3 = new Person("kim mo sun", 33);
		
		System.out.println(p1.getInfo());
		System.out.println(p2.getInfo());
		System.out.println(p3.getInfo());
		
		System.out.println("------------------");
		
		Student s = new Student("sin sa min", 22, "1234");
		Teacher t = new Teacher("ms.Lee", 55, "Teacher Number");
		Employee e = new Employee("king kim mo ", 44, "Kun so rim");
		
		s.name = "jang bo go";
		System.out.println(s.getInfo());
		System.out.println(t.getInfo());
		System.out.println(e.getInfo());

	}

}



