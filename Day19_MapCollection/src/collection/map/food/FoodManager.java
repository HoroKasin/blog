package collection.map.food;

import java.util.*;

public class FoodManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Map<String, Integer> foods = new HashMap<>();
		
		String name = null;
		Integer price = null;
		
		while(true) {
			System.out.println("== Food menu management program ==");
			System.out.println("1. Register new menu");
			System.out.println("2. View the full menu");
			System.out.println("3. Exit Program");
			System.out.print("> ");
			
			int menu = scan.nextInt();
			
			if(menu==1) {
				
				System.out.print("Enter menu name:");
				name = scan.next();
				
				if(foods.containsKey(name)) {
					System.out.println(name + "This menu has already been registered.");
				}else {
					System.out.print("Enter price: ");
					price = scan.nextInt();
					
					foods.put(name, price);
					System.out.println("New Menu " 
							+ name + "Registered.");
				}
				
			}else if(menu==2) {
				
//				Set<String> menus = foods.keySet();
//				Iterator<String> mIter = menus.iterator();
				Iterator<String> menus = foods.keySet().iterator();
				
				System.out.println("-------Menu Info-------");
				while(menus.hasNext()) {
					name = menus.next();
					price = foods.get(name);
					System.out.println(name + ": " + price + "$");
				}
				System.out.println("-----------------------");
				
				System.out.println("[1. Modify | 2. Delete | 3. Leave ]");
				System.out.print("> ");
				int sel = scan.nextInt();
				
				if(sel==1) {
					System.out.println("Please enter the name of the menu to change the price.");
					System.out.print("> ");
					name = scan.next();

					if(foods.containsKey(name)) {
						System.out.print("Enter price to change:");
						int newPrice = scan.nextInt();
						System.out.println(foods.get(name) 
								+ "$ -> " + newPrice + "$");
						foods.put(name, newPrice);

						System.out.println("The price has changed.");					

					}else {
						System.out.println("The menu is not registered.");
					}
				}else if(sel==2) {
					System.out.print("Enter menu name to delete: ");
					name = scan.next();

					if(foods.containsKey(name)) {
						foods.remove(name);
						System.out.println(name + "Deleted.");
					}else {
						System.out.println(name + "No menu.");
					}
					
				}else {
					continue;
				}
			}else {
				System.out.println("Exit the program.");
				break;
			}
		}

	}

}
