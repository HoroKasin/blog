package While_.Basic;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {

		//How to determine if one integer is a decimal
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer to determine the decimal:>");
		//variable n is the space for the variable to store the integer value to determine the decimal number
		int n = scan.nextInt();
		
		//parameter i is the variable space where the number of integers entered for decimals is stored.
		int i = 2;
		
		while(n % i != 0) {
			i++;   //Divide input integer divided by i and repeat continuously when 0
		}
		
		if( n == i) { 
			System.out.println(n + "decimal");
		}else {
			System.out.println(n + "It is not a decimal.");
		}
		
		scan.close();
	}

}
