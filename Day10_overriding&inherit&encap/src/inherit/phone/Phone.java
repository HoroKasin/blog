package inherit.phone;

public class Phone {
	
	String model;
	String color;
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void ring() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String message) {
		System.out.println("��: " + message);
	}
	void recieveVoice(String message) {
		System.out.println("����: " + message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
}








