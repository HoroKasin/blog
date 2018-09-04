package poly.car2;

public class Car {
	
	Tire[] tires = {
		new Tire("frontLeftTire", 6),
		new Tire("frontRightTire", 2),
		new Tire("rearLeftTire", 6),
		new Tire("rearRightTire", 2)
	};

	//the ability of a car to stop
	private void stop() {
		System.out.println("Stop the car.");
	}
	
	//the ability of a car to run.
	public int run() {
		System.out.println("The car is running.");
		
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return i+1;
			}
		}
		return 0;
	}
}







