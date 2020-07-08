package Day32_DateAndTimes.DateAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Task1 {
	
	/**
 	 * Create the method will take one parameter with this format "03-10-2020T04:34:13"
       This method will return String with following format "MM/dd/yyyy"
        03/10/2020

        "04-25-2020T04:34:13"
        "04/25/2020"
	 */
	
	public static String task(String str) { // My Way
		
		String result="";
	outher:	for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='T') {
				break;
			}
				if(str.charAt(i)=='-') {
					result+=""+'/';
					continue outher;
			}
				result+=""+str.charAt(i);
		}
		return result;
	}
	
	public static String changeFormat(String dateTime) { // Muammer Way
		
		String format = dateTime.substring(0,dateTime.indexOf('T')).replace("-", "/");
		// "03-10-2020"
		
		return format;
	}
	 
	public static String convertFormat (String oldFormat) { // Teymur Way
	        int indexOfT = oldFormat.indexOf("T");
	        String date =oldFormat.substring(0,indexOfT);
	        String newFormat = date.replace("-","/");
	        return newFormat;
	    }
	 
	public static void main(String[] args) {
		System.out.println(task("03-10-2020T04:34:13"));
		
		String dateTime="04-25-2020T04:34:13";
		String formatted = changeFormat(dateTime);
		System.out.println(formatted);
		
		System.out.println("==============");
		
		// this will print current localTime
		System.out.println(LocalTime.now());// now is returning localTime object
		// this will print current localDate
		System.out.println(LocalDate.now()); // now is returning localDate object
		// this will print current local date and time together
		System.out.println(LocalDateTime.now()); // now is returning LocalDateTime
		
		//What is the return type of now() method? it will return the object
		
		System.out.println("============");
		
		// Tricky question --> LocalDate date = new LocalDate(); --> This is not posible 
		// LocalDate , LocalTime , LocalDateTime classes has private constructor
		// If your constructor is private access modifier, you can not create object with new keyword.
		// We can create object using static methods
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1);
		
		System.out.println("==============");
		
		// * LOCALDATE OF METHOD
		// There are two different Of method
		//of method will return LocalDate Object
		
		LocalDate date1 = LocalDate.of(2020, 12, 07);
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(1985, Month.JUNE, 14);
		System.out.println(date2);
	//	date2.plusDays(5);
	//	System.out.println(date2.plusDays(5)); // using plus days method	
		// localDate is not mutable
		date2 = date2.plusDays(5); // re-aassign value
		System.out.println(date2);
		
		
		System.out.println("===============");
		/*
		 * LOCALTIME OF METHOD
		 * There are three implementation for Of method in LocalTime
		 * 
		 *  hour and min
		 *  hour,min,sec
		 *  hour,min,sec and nanosec
		 *  of method will return LocalTime Object
		 */
		
		LocalTime time1 = LocalTime.of(8, 44);
		System.out.println(time1);
		LocalTime time2 = LocalTime.of(21, 23, 35);
		System.out.println(time2);
		LocalTime time3 = LocalTime.of(8, 15, 28, 445464684);
		System.out.println(time3);
		
		System.out.println("===========");
		/*
		 * LOCALDATETIME Of Method
		 * There are seven implementation for of method
		 */
		
		LocalDateTime dateTime2 = LocalDateTime.of(2020, 05, 5, 22, 45,55);
		System.out.println(dateTime2);
		LocalDateTime dateTime3 = LocalDateTime.of(date2, time1);
		System.out.println(dateTime3);
		LocalDateTime dateTime4 = LocalDateTime.of(2021, Month.AUGUST, 9, 21, 59);
		System.out.println(dateTime4);
		
		// NOTE: for month value must be until 12
		// DayOfMonth must be between 0-28/31
		// Hour must be 0-23
		// min must be 0-59
		
	
	}

}
