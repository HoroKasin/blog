package Management;

import java.util.Scanner;

public class CustomerManagement {
	

	static final int MAX = 100;
	
	static String[] nameList = new String[MAX];
	static char[] genderList = new char[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthList = new int[MAX];
	
	static int count = 0;
	
	static int index = -1;
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("\n[INFO] Number of Customers Used: " + count 
								+ ", INDEX: " + index);
			System.out.println("Please select a menu..");
			System.out.println("(I)nsert, (P)revious, "
					+ "(N)ext, (C)urrent, (U)pdate, "
					+ "(D)elete, (Q)uit");
			
			System.out.print("Enter Menu: ");
			String menu = scan.next();
			
			menu = menu.toLowerCase();
			
			switch(menu.charAt(0)) {
			
			case 'i':	
				System.out.println("Enter customer information.");
				insertData();
				System.out.println("Customer information is entered as normal..");
				break;
			case 'p':
				System.out.println("View previous customer information..");
				if(index <= 0) {
					System.out.println("Information from previous customer does not exist");
				}else {
					index--;
					printData(index);					
				}				
				break;
			case 'n':
				System.out.println("Check the following customer information.");
				if(index >= count-1) {
					System.out.println("The following customer information does not exist.");
				}else {
					index++;
					printData(index);					
				}
				
				break;
			case 'c':
				System.out.println("View current customer information.");
				if((index >=0) && (index < count)) {
					printData(index);					
				}else {
					System.out.println("Customer information does not exist at this time.");
				}
				break;
			case 'u':
				if((index >=0) && (index < count)) {
					System.out.println(nameList[index] + "Modify's information.");
					updateData(index);
				}else {
					System.out.println("No data exists to modify.");
				}				
				break;
			case 'd':
				if((index >=0) && (index < count)) {
					System.out.println(nameList[index] + "Delete 's information.");
					deleteData(index);
				}else {
					System.out.println("No data exists to delete.");
				}				
				break;
			case 'q':
				System.out.println("Exit the program.");
				scan.close();
				System.exit(0);
				break;
			default:
				System.out.println("Incorrect menu entered.");
			}
		}
	}
	
	static void insertData() {
		System.out.println("=======Enter customer information=======");
		System.out.print("NAME: ");
		String name = scan.next();
		
		System.out.print("SEX(M/F): ");
		char gender = scan.next().charAt(0);
		
		System.out.print("EMAIL: ");
		String email = scan.next();
		
		System.out.print("Year of birth: ");
		int birth = scan.nextInt();
		
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthList[count] = birth;
		
		count++;
	}
	
	static void printData(int index) {
		System.out.println("======Customer Information======");
		System.out.println("NAME: " + nameList[index]);
		System.out.println("SEX: " + genderList[index]);
		System.out.println("EMAIL: " + emailList[index]);
		System.out.println("Year of birth: " + birthList[index]);
	}
	
	static void updateData(int index) {
		
		System.out.println("=======Modify Customer Information=======");
		
		System.out.print("NAME(" + nameList[index] + "): ");
		nameList[index] = scan.next();
		
		System.out.print("SEX(" + genderList[index] + "): ");
		genderList[index] = scan.next().charAt(0);
		
		System.out.print("EMAIL(" + emailList[index] + "): ");
		emailList[index] = scan.next();
		
		System.out.print("Year of birth(" + birthList[index] + "): ");
		birthList[index] = scan.nextInt();
	}
	
	static void deleteData(int index) {
		for(int i=index; i<count-1; i++) {
			nameList[i] = nameList[i+1];
			genderList[i] = genderList[i+1];
			emailList[i] = emailList[i+1];
			birthList[i] = birthList[i+1];
		}
		count--;
	}
	
}

