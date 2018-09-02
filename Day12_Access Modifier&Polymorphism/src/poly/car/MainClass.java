package poly.car;

public class MainClass {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		//drive 5 cars
		for(int i=1; i<=5; i++) {
			
			int problem = car.run();
			
			//Tire replacement logic
			switch(problem) {
			
			case 1:
				System.out.println("Renew left front wheel Kumho tire!");
				car.frontLeftTire = new KumhoTire("�frontLeft", 15);
				break;
			case 2:
				System.out.println("Renew right front wheel Nexentire!");
				car.frontRightTire = new NexenTire("frontRight", 15);
				break;
			case 3:
				System.out.println("Renew left rear wheel with Kumho tire!");
				car.rearLeftTire = new KumhoTire("rearLeft", 15);
				break;
			case 4:
				System.out.println("Renew right rear wheel base tire!");
				car.rearLeftTire = new Tire("rearLeft", 15);
			}//end switch
			System.out.println("----------------------------------");
		}//end for

	}

}




