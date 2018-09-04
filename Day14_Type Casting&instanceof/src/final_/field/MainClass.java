package final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person kim = new Person("911123-1212121", "mr.park");
		
		kim.name = "mr.kim";
		
		System.out.println("Nationality: " + kim.nation);
		System.out.println("name: " + kim.name);
		System.out.println("Resident registration number: " + kim.ssn);
		
		Person park = new Person("911131-2121111", "ms.ahn");
		System.out.println(park.ssn);
		System.out.println(kim.ssn);

	}

}



