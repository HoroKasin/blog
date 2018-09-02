package this_.car;

public class Car {
	
	private String model;
	private int speed;
	
	Car(String model) {
		this.model = model;
	}
	
	public void setSpeed(int speed) {
		
		if(this.speed >= 150) {
			System.out.println("Don't speed up.");
		}else {
			this.speed = speed;
		}
	}
	
	public void run() {
		
		for(int i=0; i<=200; i+=30) {
			this.setSpeed(i);
			System.out.println(model 
		+ "It's up to.(miles : " + speed + "km/h)");
		}
	}
}












