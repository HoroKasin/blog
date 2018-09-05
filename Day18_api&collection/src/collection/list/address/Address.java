package collection.list.address;

import java.util.*;

public class Address {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> nameList = new ArrayList<>();
		ArrayList<String> phoneList = new ArrayList<>();
		
		String name, phone;		
		int menu = 0, result = 0;		
		boolean bool = true;
		
		while(bool) {
			System.out.println("\n=======Managing Contacts=======");
			System.out.println("1. Register Contact");
			System.out.println("2. Search Contacts");
			System.out.println("3. Delete Contact");
			System.out.println("4. View all Contacts");
			System.out.println("5. Exit Program");
			System.out.print("메뉴 입력: ");
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1:
				// enter a name and phone number and save the information in each list.
				System.out.print("name: ");
				name = scan.next();
				System.out.print("Phone number: ");
				phone = scan.next();
				
				nameList.add(name);
				phoneList.add(phone);
				System.out.println(name + "Save Contacts Complete!");
				break;
				
			case 2:
				System.out.println("Please enter a name to find.");
				System.out.print("> ");
				name = scan.next();
				
				//The indexOf message in the list returns -1 
				//if the object is not in the list.
				result = nameList.indexOf(name);
				if(result == -1) {
					System.out.println(name + "is not on the list.");
				}else {
					name = nameList.get(result);
					phone = phoneList.get(result);
					System.out.println(name + ": " + phone);
				}				
				break;
				
			case 3:
				System.out.println("Please enter a name to delete.");
				System.out.print("> ");
				name = scan.next();
				
				result = nameList.indexOf(name);
				
				if(result == -1) {
					System.out.println(name + "is not on the list.");
				}else {
					//remove returns as soon as the object is removed from the list.
					name = nameList.remove(result);
					phone = phoneList.remove(result);
					System.out.println(name + ": " + phone + "Deleted.");
				}							
				break;
			case 4:
				System.out.println("=========Check All Contacts=========");
				//process all objects in the list with a repeating statement 
				//print in"Name: Contact Us" format
				for(int i=0; i<nameList.size(); i++) {
					name = nameList.get(i);
					phone  = phoneList.get(i);
					System.out.println(name + ": " + phone);
				}
				break;
			case 5:
				System.out.println("Exit the program.");
				bool = false;
				break;
			default:
				System.out.println("You have entered the wrong menu.");
			}//end switch
		}//end while
	}

}





