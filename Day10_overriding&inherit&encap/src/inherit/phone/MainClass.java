package inherit.phone;

public class MainClass {

	public static void main(String[] args) {
		
		DmbPhone dp = new DmbPhone("�Ƹ�����", "��Ż�׷���", 7);
		
		System.out.println("��: " + dp.model);
		System.out.println("����: " + dp.color);
		//DmbPhone�� ������ ��� ������ ����
		System.out.println("ä��: " + dp.channel);
		System.out.println("-----------------");
		
		dp.powerOn();
		dp.ring();
		dp.sendVoice("��������");
		dp.recieveVoice("�ȳ��ϼ���. ��̿������Դϴ�.");
		dp.hangUp();
		
		dp.turnOnDmb();
		dp.changeChannel(11);
		dp.turnOffDmb();
		
		SmartPhone sp = new SmartPhone("������S9", "�ڹ�Ʈ���", 5);
		
		sp.powerOn();
		sp.turnOnDmb();
		sp.internet();
	}
}




