package Day34_DateAndTime.DatTimePracticeDay3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Dates {
	
	public static void main(String[] args) {
		
		Period period = Period.ofWeeks(3);
		
		System.out.println(period); // weeks automatically convert to day
		
		LocalDate date=LocalDate.now();
		// we instantiate the object using static method
		System.out.println(date);
		
		date=date.plus(period);
		System.out.println(date);
		
		//yyyy-MM-dd  ---->> Default format
		
		System.out.println(LocalTime.now()); // HH:mm:ss.nanoSec
		
		System.out.println(LocalDateTime.now()); // 2020-04-08T18:33:06.729888500
		
		/*
		 * First create DateTiemFormatter Class 
		 * After use format method which is coming from DateTimeFormatter
		 */
		DateTimeFormatter isoDate= DateTimeFormatter.BASIC_ISO_DATE; // "20111203"
	
		// format method will return String
		// you can not say date = isoDate.format(date);
		System.out.println(isoDate.format(date));
	//	date = isoDate.format(date); // compile error
		String dateFormat=isoDate.format(date);
		
		System.out.println(date); // it is not change because immutable object
		
		/*
		 * TASK
		 * Create one LocalTime object with current time.
		 * Then use ISO LOCAL TIME to modify your time format and print new format
		 */
		
		LocalTime time = LocalTime.of(2, 33, 22, 6564);
	//	LocalTime obj = LocalTime.now();
		System.out.println(time);
		DateTimeFormatter timeFormatter= DateTimeFormatter.ISO_LOCAL_TIME; 
		String obj1 = timeFormatter.format(time);
		System.out.println(obj1);
		
		// We have other pre-defined structurein java. Short,Medium, Long
		
		DateTimeFormatter formatTime=DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(formatTime.format(time));
		
		DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		System.out.println(mediumFormat.format(LocalTime.now()));
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		DateTimeFormatter shortDateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumDateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter longDateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		System.out.println("SHORT "+ shortDateFormat.format(date1));
		System.out.println("MEDIUM "+ mediumDateFormat.format(date1));
		System.out.println("LONG "+ longDateFormat.format(date1));
	
		
		/*
		 * TASK
		 * Using FormatStyle.SHORT modify your LocalDateTime object and print it
		 * You need to call ofLocallizedDateTime method
		 */
		
		LocalDateTime xxx = LocalDateTime.now();
		DateTimeFormatter vvv = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(vvv.format(xxx));
		
		LocalDateTime localDateTime = LocalDateTime.now();
	    System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));	
	    System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));	
	//    System.out.println(localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
	    // LONG doesn't work for LocalTime and LocalDateTime
	    
	    System.out.println("====================");
	    
	    //Pattern for your localDateTime
	    
	    /*
	     * yyyy ----> full year
	     * yy   ----> last two digits of year
	     * MMMM ----> If you give the MM it will give you full name of month (It need to be uppercase
	     * MMM  ----> it will give short name of month APR, JAN,
	     * MM   ----> It will give two digit of 04
	     * M    ----> It will give you one digit 4
	     * HH   ----> It will give two digit of hour
	     * H    ----> It will give you one digit
	     * mm   ----> It will symbolize the minute
	     * dd   ----> It will give you the day of month
	     * d    ----> It will give one digit
	     * a    ----> to be able to display the am or pm
	     * ss   ----> will give the second
	     */
	    
	    LocalDateTime dateTime = LocalDateTime.now();
	    System.out.println(dateTime);
	    // MMMM/dd/yyyy-HH:mm
	    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM/dd/yy-HH:mm.ss:ns a");
	    System.out.println(f1.format(dateTime));
	    
	    LocalDateTime amTime = LocalDateTime.of(2020, 05, 13, 23, 3);
	    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd%M%YYYY=HH:mm a");
	    System.out.println(f2.format(amTime));
	    
	    /*
	     * TASK
	     * Create the date with following value 2008 January 9
	     * Format the date as following structure Jan/9/08
	     */
	    
	    LocalDate datex = LocalDate.of(2008, Month.JANUARY, 9);
	    DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MMM/d/yy");
	    System.out.println(f3.format(datex));
	    System.out.println(datex.format(DateTimeFormatter.ofPattern("MMM/D/yy")));
	}

}
