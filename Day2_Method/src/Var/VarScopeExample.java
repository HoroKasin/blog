package Var;

public class VarScopeExample {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		if(num1 > 10) {
			int num3 = num1 + num2;
		}
		int num3 = 14;
		
		int num4 = num2 + num3;
		System.out.println(num4);
	}

}








