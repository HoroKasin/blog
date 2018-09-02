package encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		
		date.setDay(24);
		System.out.println(date.getDay());
		
		date.setMonth(8);
		date.setYear(2018);
		
		System.out.println(date.getYear() + "-" 
		+ date.getMonth() + "-" + date.getDay());

	}

}





