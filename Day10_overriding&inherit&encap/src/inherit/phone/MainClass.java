package inherit.phone;

public class MainClass {

	public static void main(String[] args) {
		
		DmbPhone dp = new DmbPhone("아몰레드", "메탈그레이", 7);
		
		System.out.println("모델: " + dp.model);
		System.out.println("색상: " + dp.color);
		//DmbPhone에 선언한 멤버 변수에 접근
		System.out.println("채널: " + dp.channel);
		System.out.println("-----------------");
		
		dp.powerOn();
		dp.ring();
		dp.sendVoice("여보세요");
		dp.recieveVoice("안녕하세요. 김미영팀장입니다.");
		dp.hangUp();
		
		dp.turnOnDmb();
		dp.changeChannel(11);
		dp.turnOffDmb();
		
		SmartPhone sp = new SmartPhone("갤럭시S9", "코발트블루", 5);
		
		sp.powerOn();
		sp.turnOnDmb();
		sp.internet();
	}
}




