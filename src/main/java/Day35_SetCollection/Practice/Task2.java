package Day35_SetCollection.Practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
	public static void main(String[] args) {
		
	
	/*
	 *                             Day Month year
	 * Create the String has value of 9.07.15
	 * From this String value convert date time object
	 * After that change the pattern to July/09/2015
	 */
	
	String date1 = "9.07.15";
	//LocalDate value = LocalDate.parse(str);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.MM.yy");
	// this format will help me to convert String to Date object
	
	LocalDate localDate = LocalDate.parse(date1, formatter);
	System.out.println(localDate);
	
	DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
	System.out.println(localDate.format(formatter2));
	System.out.println(formatter2.format(localDate));
	
	// Did you check the console? What is an error in console? Log file?
	// Did you run your code in debug mode?

	System.out.println(localDate.getDayOfMonth());
	System.out.println(localDate.getDayOfWeek());
	System.out.println(localDate.getMonthValue());
	
	
			
			
	}
}
