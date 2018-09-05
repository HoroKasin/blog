package collection.list.person;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Person> people = new ArrayList<>();		
		
		while(true) {
			
			System.out.println("Please enter a menu.");
			System.out.println("[ 1. Membership registration | "
					+ "2. View all Member Information"
					+ " | 3. Exit ]");
			System.out.print("> ");
			
			int menu = scan.nextInt();
			
			if(menu==1) {
				System.out.println("Please enter your name and age.");
				System.out.print("name: ");
				String name = scan.next();
				
				System.out.print("age: ");
				int age = scan.nextInt();
				
				Person p = new Person(name, age);
				
				people.add(p);
				
			}else if(menu==2) {
				
				System.out.println("--------Information of all members--------");
				
				for(int i=0; i<people.size(); i++) {
					Person p = people.get(i);
					String name = p.getName();
					int age = p.getAge();
					System.out.println("name: " + name + ", age: " + age);
				}
				System.out.println("-------------------------------");
				
			}else {
				System.out.println("Exit the program.");
				break;
			}
		}

	}

}







