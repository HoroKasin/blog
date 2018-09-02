package this_.car;

public class MainClass {
	
	public static void main(String[] args) {
		
		Car myCar = new Car("Lamborghini");
		Car yourCar = new Car("sonata");
		
		myCar.run();
		System.out.println("-------------------");
		yourCar.run();
	}
}
