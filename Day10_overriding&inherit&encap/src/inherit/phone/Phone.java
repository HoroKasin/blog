package inherit.phone;

public class Phone {
	
	String model;
	String color;
	
	void powerOn() {
		System.out.println("Turn on the power.");
	}
	void powerOff() {
		System.out.println("Turn off the power.");
	}
	void ring() {
		System.out.println("The bell rings.");
	}
	void sendVoice(String message) {
		System.out.println("Me: " + message);
	}
	void recieveVoice(String message) {
		System.out.println("the other party: " + message);
	}
	void hangUp() {
		System.out.println("Hang up the phone.");
	}
	
}








