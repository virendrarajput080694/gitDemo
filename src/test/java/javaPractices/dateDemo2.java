package javaPractices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo2 {

	public static void main(String[] args) {
		
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy HH:MM:SS");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());
		System.out.println("testing");
		System.out.println("Automation testing");

	}

}
