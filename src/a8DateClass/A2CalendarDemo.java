package a8DateClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class A2CalendarDemo {

	public static void main(String[] args) {
		/*
		 * Calendar is Class
		 * So Why we're using this Calendar class on Date class
		 * Calendar class provides some additional methods over there
		 */
		
		Calendar cal = Calendar.getInstance();
		
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		//System.out.println(sd.format(d));
		//05/11/2022 06:30:09
		
		System.out.println(sd.format(cal.getTime()));
		//05/11/2022 06:47:14
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		//11
		
		System.out.println(cal.get(Calendar.AM_PM));
		//1
		//AM-0, PM-1
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		//4
		
		System.out.println(cal.get(Calendar.MINUTE));
		//56
		
	}

}
