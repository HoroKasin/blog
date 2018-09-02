package poly.car;

public class Car {
	
	//硫ㅻ쾭 蹂��닔 �꽑�뼵
	Tire frontLeftTire = new Tire("frontLeftTire", 6);
	Tire frontRightTire = new Tire("frontRightTire", 2);
	Tire rearLeftTire = new Tire("rearLeftTire", 6);
	Tire rearRightTire = new Tire("rearRightTire", 2);
	
	//the ability of a car to stop
	private void stop() {
		System.out.println("Stop the car.");
	}
	
	//the ability of a car to run.
	public int run() {
		System.out.println("The car is running.");
		
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;			
		}else if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}else if(rearLeftTire.roll() == false) {
			stop();
			return 3;
		}else if(rearRightTire.roll() == false) {
			stop();
			return 4;
		}else {
			return 0;
		}
	}
}







