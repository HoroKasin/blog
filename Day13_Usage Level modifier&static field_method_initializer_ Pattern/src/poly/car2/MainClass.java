package poly.car2;

public class MainClass {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		//drive 5 cars
		for(int i=1; i<=5; i++) {
			
			int problem = car.run();
			
			if(problem != 0) {
				System.out.println(car.tires[problem-1].location 
						+ "Renew left rear wheel with Kumho tire!");
				String problemLocation = car.tires[problem-1].location;
				car.tires[problem-1] = new KumhoTire(problemLocation, 15);
			}
			System.out.println("----------------------------------");
		}//end for
	}
}




