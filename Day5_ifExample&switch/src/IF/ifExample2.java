package IF;

import java.util.Scanner;

public class ifExample2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the height and age.");
		System.out.print("height:>");
		double height = scan.nextDouble();
		
		System.out.println("age:>");
		int age = scan.nextInt();
		
		System.out.println("===============");
		
		Ride ride only when height is 140 and age is 8 years or older
		if((height >= 180) && (age >= 8 )) {
			System.out.println("You can board the ride.");
		}else {
			System.out.println("You cannot board the ride.");
		}
		System.out.println("Have a nice day.~");
		scan.close();
	}

}
