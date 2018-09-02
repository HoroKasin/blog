package inherit.phone;

public class DmbPhone extends Phone {
	
	int channel;
	
	DmbPhone(String pModel, String pColor, int pChannel) {
		model = pModel;
		color = pColor;
		channel = pChannel;
	}
	
	void turnOnDmb() {
		System.out.println("Start receiving the broadcast.");
	}
	void turnOffDmb() {
		System.out.println("Terminate reception.");
	}
	void changeChannel(int pChannel) {
		channel = pChannel;
		System.out.println("channel " + channel + "Change to number.");		
	}
}








