package Day35_SetCollection.Practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatPractice {
	public static void main(String[] args) {
		
		/*
		 * Create the String has value of"06/30/2018-10:01"
           Convert the String to dateTime Object
           After that create following strructure 30-06-18 % 10-01
		 */
		
		// First Create String value
		String value ="06/30/2018-10:01";
		
		// Default DATETIME FORMAT  ------>> 2020-04-11T10:14:19.828
		//Define DateTimeFormatter
		// If your String date structure is different than the java default date structure
		// You must define your DateTimeFormatter for String
	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy-HH:mm");
		LocalDateTime localDateTime = LocalDateTime.parse(value, formatter);
		System.out.println(localDateTime);
		
		// Actual Format is   --> 2018-06-30T10:01
		// Expected Format is --> 30-06-18 % 10-01
		
		// LocalDateTime ---> String new format
		
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd-MM-yy % HH-mm");
		System.out.println(f2.format(localDateTime));
		System.out.println(localDateTime); // Object is immatable
		
	//	localDateTime = f2.format(localDateTime); result is String cuz we can't reassign
		String result = f2.format(localDateTime);
		System.out.println(result);
		
		// String ---> LocalDateTime  ---> String 
		
	}

}
