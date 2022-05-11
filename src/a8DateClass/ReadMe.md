# Date and Calendar Class

## a8DateClass

## A1DateDemo

```
Date is Class,
we can get currentDate, CurrentTime
Java.util have collection framework and Date class also
```

```
package a8DateClass;
//Video-40
import java.text.SimpleDateFormat;
import java.util.Date;

public class A1DateDemo {

	public static void main(String[] args) {
		/*
		 * Date is Class,
		 * we can get currentDate, CurrentTime
		 * Java.util have collection framework and Date class also
		 */
		
		Date d = new Date();
		
		System.out.println(d.toString());
		/*
		 * gives today's date in machine's format
		 * Wed May 11 18:24:27 IST 2022
		 */
		
		/*
		 * what if date required in particular format?
		 * mm/dd/yyyy HH:MM:SS
		 * 
		 * SimpleDateFormat - Class
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(d));
		/*
		 * It gives today's date in mentioned format
		 * 24/11/2022
		 */
		
		//More Codes: https://www.tutorialspoint.com/java/java_date_time.htm
		
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
		//05/11/2022 06:30:09
		
		SimpleDateFormat ssd = new SimpleDateFormat("MMM-dd-yyyy hh:mm:ss");
		System.out.println(ssd.format(d));
		//May-11-2022 06:30:52
	}

}
```

## A2CalendarDemo

```
Calendar is Class
So Why we're using this Calendar class on Date class
Calendar class provides some additional methods over there
```

```
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
```