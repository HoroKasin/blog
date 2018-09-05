package api.util.random;

import java.util.Random;

public class TodayLuck {
	
	public static Random r = new Random();

	public static void main(String[] args) {
		
		System.out.println("--------Fortune of today--------");
		System.out.println("luckyNumber: " + luckyNumber());
		System.out.println("luckyColor: " + luckyColor());
	}
	
	public static String luckyColor() {
		double d = r.nextDouble();
		
		if(d > 0.66) {
			return "red";
		}else if(d > 0.33) {
			return "yellow";
		}else {
			return "green";
		}			
	}
	
	public static int luckyNumber() {
		return r.nextInt(10) + 1; 
	}

}









