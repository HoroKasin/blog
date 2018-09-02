package poly.car;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	public boolean roll() {
		++accumulationRotation;
		
		//for normal rotation (leak number of turns < full rotation)
		if(accumulationRotation < maxRotation) {
			System.out.println(location + " Kumho Tire Life"
					+ (maxRotation - accumulationRotation)
					+ "th");
			return true;
		}else {
			//If the tire is flat (leak number of turns = = maximum number of rotations)
			System.out.println("*** " + location 
						+ " a wheel blows on a Kumho tire! ***");
			return false;
		}
	}

}
