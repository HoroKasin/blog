package inherit.phone;

public class DmbPhone extends Phone {
	
	int channel;
	
	DmbPhone(String pModel, String pColor, int pChannel) {
		model = pModel;
		color = pColor;
		channel = pChannel;
	}
	
	void turnOnDmb() {
		System.out.println("��� ������ �����մϴ�.");
	}
	void turnOffDmb() {
		System.out.println("��� ������ �����մϴ�.");
	}
	void changeChannel(int pChannel) {
		channel = pChannel;
		System.out.println("ä�� " + channel + "������ �����մϴ�.");		
	}
}








