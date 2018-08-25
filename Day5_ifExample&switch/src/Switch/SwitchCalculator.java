package Switch;


public class SwitchCalculator {

	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.println("두 수를 계산하는 계산기입니다.");
			System.out.println("사용 예: 5 x 4");
			return; //당장 메서드를 나가라.
		}
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[2]);
		
		switch(args[1]) {
		
		case "+":
			System.out.println("두 수의 합은: " + (n1 + n2));
			break;
		case "-":
			System.out.println("두 수의 차는: " + (n1 - n2));
			break;
		case "x":
			System.out.println("두 수의 곱은: " + (n1 * n2));
			break;
		case "/":
			System.out.println("두 수의 나눗셈은: " + (n1 / n2));
			break;
		}

	}

}

