package api.util.calendar;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		int week = cal.get(Calendar.DAY_OF_WEEK);
		//		System.out.println(week);

		String strWeek = null;

		switch(week) {
		case Calendar.MONDAY:
			strWeek = "Monday";
			break;
		case Calendar.TUESDAY:
			strWeek = "Tuesday";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "Wednesday";
			break;
		case Calendar.THURSDAY:
			strWeek = "Thursday";
			break;
		case Calendar.FRIDAY:
			strWeek = "Friday";
			break;
		case Calendar.SATURDAY:
			strWeek = "Saturday";
			break;
		default:
			strWeek = "Sunday";
		}

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.println("Today " + year 
				+ "year" + month + "month" 
				+ day + "day");
		System.out.println(hour + "hour" 
				+ minute + "minute" 
				+ second + "second" 
				+ strWeek + "strWeek");

	}

}
