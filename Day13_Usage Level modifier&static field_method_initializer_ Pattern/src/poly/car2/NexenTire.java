package poly.car2;

public class NexenTire extends Tire {

	public NexenTire(String location, int maxRotation) {
		super(location, maxRotation);
	}	

	public boolean roll() {
		++accumulationRotation;

		//for normal rotation (leak number of turns < full rotation)
		if(accumulationRotation < maxRotation) {
			System.out.println(location + " Nexentire Life"
					+ (maxRotation - accumulationRotation)
					+ "th");
			return true;
		}else {
			//If the tire is flat (leak number of turns = = maximum number of rotations)
			System.out.println("*** " + location 
					+ " burst with a nexenTire! ***");
			return false;
		}
	}

}
