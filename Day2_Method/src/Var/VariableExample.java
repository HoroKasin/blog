package Var;

public class VariableExample {

	public static void main(String[] args) {
		
		/*
		 * How variables are declared.
		 * [Data type] [parameter name];
		 * Variables cannot be duplicated with the same name
		 * int is a typical data type that stores integer.
		 */
		int number1;
		
		number1 = 10;
		System.out.println("Data stored in number1: " + number1);
		
		int number2 = 20;
		
		int result = number1 + number2;
		System.out.println("result: " + result);
		
		number2 = 50;
		System.out.println("number2: " + number2);
		
		result = number1 + number2;
		System.out.println(result);
	}

}








