package collection.map;

import java.util.*;

public class Login {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Map<String, String> users = new HashMap<>();
		
		users.put("kim1234", "kkk1234");
		users.put("lee5678", "lll5678");
		users.put("park4321", "ppp4321");
		
		while(true) {
			
			System.out.println("Please enter your ID and password.");
			System.out.print("ID: ");
			String id = scan.next();
			
			System.out.print("Password: ");
			String pw = scan.next();
			
			/*
			 * <Verification of Login Inputs>

			 * 1. The ID entered is at the key value entered in the map 
			 * Check if applicable (use the contentsKey method)
			 * 2. If yes, compare again with the password value and match the password.
			 * Output "Login Successful" to the console and exit the repeat.
			 * 3. If the password is different, print "Password incorrect."
			 * 4. If the ID entered is not a key value entered in the map 
			 * Print out ID does not exist.
			 */
			
			if(users.containsKey(id)) {
				String chkPw = users.get(id);
				if(pw.equals(chkPw)) {
					System.out.println("Login Successful!");
					break;
				}else {
					System.out.println("Incorrect password.");
				}				
			}else {
				System.out.println("ID does not exist.");
			}
		}

	}

}
