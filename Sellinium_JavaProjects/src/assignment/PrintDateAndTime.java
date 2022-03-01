package assignment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date s = new Date();
		System.out.println(s);
		
		DateFormat df = new SimpleDateFormat("dd_MMM_YYYY_HH_mm_ss aa zz");
		
		System.out.println(df.format(s));
		
	}

}
