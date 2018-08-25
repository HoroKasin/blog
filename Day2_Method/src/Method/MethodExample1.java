package Method;

public class MethodExample1 {
	
	/*
	 * 1. 메서드는 선언하는 과정과 호출하는 과정이 있습니다.
	 * 2. 선언하는 과정은 메서드를 만드는 과정이며 해당 메서드의
	 *    기능을 상세하고 메서드 실행을 위해 필요한 입력데이터를
	 *    처리할 수 있는 매개 변수를 선언하며 출력할 데이터의 타입
	 *    등을 지정하고 내부 로직을 작성합니다.
	 * 3. 호출하는 과정은 메서드를 사용하는 과정이며 해당 메서드가
	 *    필요로하는 매개값(입력값)을 메서드에 전달하면서
	 *    입력값을 통해 처리한 결과값(출력값)을 반환받습니다.
	 * 4. 메서드의 선언은 메서드 내부에서는 할 수 없습니다.
	 *    반드시 메서드 밖에서 선언해야 합니다.
	 * 5. 메서드 내부에서는 메서드의 호출만 가능합니다.        
	 */

	public static void main(String[] args) {
		
		//메서드의 호출
		greeting();
		luckyNumber(57);
		
		//반환 유형(리턴 타입)이 있는 메서드는 반환받은
		//결과값을 변수에 저장해야만 사용할 수 있습니다.
		String addr = getAddress();
		System.out.println("내주소: " + addr);
		
		String info = petsInfo("고라니", "청설모");
		System.out.println(info);
		
	}//메인메서드의 끝부분
	
	//1. input과 output이 둘 다 없는 메서드 선언.
	static void greeting() {
		System.out.println("안녕하세요?");
		System.out.println("반갑습니다.");
	}
	
	//2. input은 있고 output이 없는 메서드
	static void luckyNumber(int number) {
		System.out.println("행운의 숫자는: " + number);
	}
	
	//3. input은 없고 output이 존재하는 메서드
	static String getAddress() {
		String address = "서울시 강남구";
		/*
		 * output이 있는 메서드는 반드시 return이라는
		 * 키워드를 사용하여 값을 반환(전달)해야 합니다.
		 * 반환값이 있는 메서드는 return을 만나는 순간
		 * 종료되어 호출부로 이동합니다.
		 * 그래서 return아래에 코드를 작성할 수 없습니다.
		 */
		return address;
	}
	
	//4. input과 output이 동시에 존재하는 메서드
	static String petsInfo(String pet1, String pet2) {
		String petInfo = pet1 + "와 " + pet2;
		return petInfo;
	}
}









