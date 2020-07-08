package Day34_DateAndTime.DatTimePracticeDay3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParseMethod {
	
	public static void main(String[] args) {
		
		String strDate = "2010-10-24";
		
		LocalDate date = LocalDate.parse(strDate);
		System.out.println(date);
		
//		System.out.println(LocalTime.now());
	    
		String strTime = "18:13:20.314";
		LocalTime time = LocalTime.parse(strTime);
	    System.out.println(time);
	    
	    System.out.println(LocalDateTime.now());
	    
	    String strDateTime="April 24 2015 10 20";
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yyyy HH mm");
		LocalDateTime localDateTime = LocalDateTime.parse(strDateTime, formatter);
		System.out.println(localDateTime);
	
		/*
		 * 2015=Apr=24/20;10
		 */
		
	    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy=MMM=dd/mm;HH");
	    System.out.println(f2.format(localDateTime));
		
	}

}
