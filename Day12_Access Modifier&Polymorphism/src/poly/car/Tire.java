package poly.car;

public class Tire {
	
	public int maxRotation;//maximum number of turns in a tire
	public int accumulationRotation;//the accumulated number of turns in a tire
	public String location;//location of tire
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumulationRotation;
		
		//for normal rotation (leak number of turns < full rotation)
		if(accumulationRotation < maxRotation) {
			System.out.println(location + " tire life"
					+ (maxRotation - accumulationRotation)
					+ "th");
			return true;
		}else {
			//If the tire is flat (leak number of turns = = maximum number of rotations)
			System.out.println("*** " + location 
						+ "burst with a Tire! ***");
			return false;
		}
	}
}






