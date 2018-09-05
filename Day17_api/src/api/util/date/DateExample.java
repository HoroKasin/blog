package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		//create an object by invoking a default constructor
		//make the local time of the current operating system an object
		Date date = new Date();
		
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��"); //korea
		String time = sdf.format(date);
		System.out.println(time);
		
		sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss"); //korea
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("������ E�����Դϴ�."); //korean
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("������ 1���߿� D��° ���Դϴ�."); //korean
		System.out.println(sdf.format(date));

	}

}





