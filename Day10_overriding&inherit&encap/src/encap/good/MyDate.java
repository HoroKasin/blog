package encap.good;

public class MyDate {
	
	//은닉(캡슐화)을 사용하려면 숨기고 싶은 변수의 앞부분에
	//private이라는 제한자를 붙입니다.
	private int year;
	private int month;
	private int day;
	
	public void setDay(int d) {
		
		if((d<1) || (d>31)) {
			System.out.println("잘못된 날짜입력입니다.");
		}else {
			day = d;
			System.out.println("날짜정보: " + day + "일");
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setMonth(int m) {
		if((m<1) || (m>12)) {
			System.out.println("잘못된 월 수 입력입니다.");
		}else {
			month = m;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setYear(int y) {
		if(y < 0) {
			System.out.println("잘못된 연도 입력입니다.");
		}else {
			year = y;
		}
	}
	
	public int getYear() {
		return year;
	}
}












