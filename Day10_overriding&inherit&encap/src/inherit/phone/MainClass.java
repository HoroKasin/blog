package inherit.phone;

public class MainClass {

	public static void main(String[] args) {
		
		DmbPhone dp = new DmbPhone("AMOLED", "Metal Grey", 7);
		
		System.out.println("MODEL: " + dp.model);
		System.out.println("COLOR: " + dp.color);
		System.out.println("CHANNEL: " + dp.channel);
		System.out.println("-----------------");
		
		dp.powerOn();
		dp.ring();
		dp.sendVoice("HELLO?");
		dp.recieveVoice("HELLO. Team leader..");
		dp.hangUp();
		
		dp.turnOnDmb();
		dp.changeChannel(11);
		dp.turnOffDmb();
		
		SmartPhone sp = new SmartPhone("Galaxy S9", "Cobalt Blue", 5);
		
		sp.powerOn();
		sp.turnOnDmb();
		sp.internet();
	}
}




