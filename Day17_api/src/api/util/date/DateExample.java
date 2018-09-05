package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		//create an object by invoking a default constructor
		//make the local time of the current operating system an object
		Date date = new Date();
		
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초"); //korea
		String time = sdf.format(date);
		System.out.println(time);
		
		sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss"); //korea
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("오늘은 E요일입니다."); //korean
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("오늘은 1년중에 D번째 날입니다."); //korean
		System.out.println(sdf.format(date));

	}

}





