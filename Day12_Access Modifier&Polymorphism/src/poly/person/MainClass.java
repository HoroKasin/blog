package poly.person;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		
		Person hong = new Student("ms.lee", 17, "32");
		Person lee = new Student("ms.kim", 18, "23");
		Person park = new Student("ms.kun", 19, "44");
		Person son = new Teacher("ms.nam", 33, "subject");
		Person lim = new Teacher("ms.ahn", 53, "studentId");
		Person kim = new Employee("ms.park", 33, "subject");
		
		System.out.println(hong);
		System.out.println(son);
		System.out.println(kim);
		
		Person[] people = {hong, lee, park, son, lim, kim};
		
		for(Person p : people) {
			System.out.println(p.getInfo());
		}
		
		Object[] objArr = new Object[3];
		objArr[0] = 13;
		objArr[1] = "hello";
		objArr[2] = 3.1415;
		
		System.out.println(Arrays.toString(objArr));

	}

}



