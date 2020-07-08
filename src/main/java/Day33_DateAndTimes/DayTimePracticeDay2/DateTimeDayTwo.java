package Day33_DateAndTimes.DayTimePracticeDay2;

import java.time.*;

public class DateTimeDayTwo {
	public static void main(String[] args) {
		
		// We can not create Date classes with new keyword since
		// they have private constructor.
		// In everwhere in java, when you use the private constructor
		// you must create static method to instantiate your object
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		// plusYear/plusMonth / plusWeek/ PlusDay
		//( this method will available to use for LocalDate and LocalDateTime)
		
		System.out.println(date);
		date.plusYears(1);
		// Date classes are immutable
		System.out.println(date);
		date=date.plusYears(1);// reassign the value
		System.out.println(date);
		
		// plusHour/ minusHour -->
		// (this method  will available to use for  LocalTime and  LocalDateTime)
		
		time = time.plusHours(1);
		System.out.println(time);
		
		// for date class methods we can do method chaining
		
		System.out.println(dateTime);
		// 2024 12 07 23:20
		// Month is more than 12 since we are using plus method it will increasethe year
		dateTime = dateTime.plusYears(4).plusMonths(10).plusHours(24).minusMinutes(33);
		System.out.println(dateTime);
		
   	// Since the month is more than 12 It throws the exception
	//	LocalDateTime dateTime1 = LocalDateTime.of(2024, 14, 20, 10, 35);
	
		/*
		 *  TASK
		 *  Create LocalDate using of method and give your birthday,
		 *  then using plus and minus method find the current date after that print the result
		 */
		
		// 
		LocalDate birthDay = LocalDate.of(1995, Month.JANUARY, 01);
		
		LocalDate current = birthDay.plusYears(25).plusMonths(3).plusDays(6);
		System.out.println(current);
		// what is Static Polymorphism?\
		/*
		 * Static Polymorphism(Compile Time) is related with compile time in Java. 
		 * Method overloading in java will be decided at compile time.
		 * If you have overloaded method, java will decide which method to call at compile time.
		 * Dynamic Polymorphism(Runtime):
		 * It is related with method overlaoding, java will decide which overrided method to call at runtime
		 */
		
		// sourceCode --(Compile Code)--> ByteCode ---> JVM(runtime) ---> binary 
		
		// javac DatePractice.java
		// DatePractice.class
	}

}
