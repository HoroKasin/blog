package encap.good;

public class MyDate {
	
	//����(ĸ��ȭ)�� ����Ϸ��� ����� ���� ������ �պκп�
	//private�̶�� �����ڸ� ���Դϴ�.
	private int year;
	private int month;
	private int day;
	
	public void setDay(int d) {
		
		if((d<1) || (d>31)) {
			System.out.println("�߸��� ��¥�Է��Դϴ�.");
		}else {
			day = d;
			System.out.println("��¥����: " + day + "��");
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setMonth(int m) {
		if((m<1) || (m>12)) {
			System.out.println("�߸��� �� �� �Է��Դϴ�.");
		}else {
			month = m;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setYear(int y) {
		if(y < 0) {
			System.out.println("�߸��� ���� �Է��Դϴ�.");
		}else {
			year = y;
		}
	}
	
	public int getYear() {
		return year;
	}
}












