package poly.param;

public class MainClass {

	public static void main(String[] args) {
		
		Driver kim = new Driver();
		
		Vehicle v = new Vehicle();
		kim.drive(v);
		
		Bus b = new Bus();
		kim.drive(b);
		kim.drive(new Taxi());
	}

}






