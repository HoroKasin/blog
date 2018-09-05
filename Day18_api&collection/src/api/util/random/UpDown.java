package api.util.random;

import java.util.Random;
import java.util.Scanner;
												//korean GAME!!
public class UpDown {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int secret = r.nextInt(100) + 1;
		
		int cnt = 0;
		
		System.out.println("[UP&DOWN GAME - Which number is between 1 and 100????]");
		
		while(true) {
			System.out.println("------------------------------------");
			System.out.print("Please enter a number: ");
			int n = sc.nextInt();
			
			if(n == 0) {
				break;
			}
			
			cnt++;
			
			if(n == secret) {
				System.out.println("That's right.!!!" + cnt + " You hit it.");
				break;
			}else if(n < secret) {
				System.out.println("UP!!!!");
			}else {
				System.out.println("DOWN!!!!");
			}
			
		}

	}

}
