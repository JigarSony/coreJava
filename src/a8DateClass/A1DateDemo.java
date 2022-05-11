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
