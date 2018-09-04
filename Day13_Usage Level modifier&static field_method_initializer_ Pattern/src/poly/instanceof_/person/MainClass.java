package poly.instanceof_.person;

public class MainClass {

	public static void main(String[] args) {
		
		//korean Nick_name :D
		Person p = new Person("´ß°­Á¤", 22);
		Student s = new Student("´Ü¹«Áö", 12, "1234");
		Teacher t = new Teacher("±è¸»ÀÌ", 33, "±¹»ç");
		Employee e = new Employee("¶±ººÀÌ", 44, "¿µ¾÷ºÎ");
		
		printPersonInfo(p);
		printPersonInfo(s);
		printPersonInfo(t);
		printPersonInfo(e);
	}
	
	public static void printPersonInfo(Person p) {
		
		if(p instanceof Student) {
			System.out.println("******** Student Info ********");
		}else if(p instanceof Teacher) {
			System.out.println("******** Teacher Info ********");
		}else if(p instanceof Employee) {
			System.out.println("******** Employee Info ********");
		}else {
			System.out.println("******** Person Info ********");
		}
		
		System.out.println(p.getInfo());
	}

}








