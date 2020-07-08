package Day33_DateAndTimes.DayTimePracticeDay2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class PeriodPractice {
	
	// this method will take two parameters oldDate, newDate, find the period between this dates
	public static int findPeriod(LocalDate oldDate, LocalDate newDate,Period period) {
		int count=0;
		
		while(oldDate.isBefore(newDate)) {
			count++;
			oldDate=oldDate.plus(period);
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		LocalDate pastDate = LocalDate.of(2018, 05, 23);
		LocalDate date = LocalDate.now();
		
		// isBefore and isAffer 
		
		System.out.println("isBefore method"+pastDate.isBefore(date));
		System.out.println("isAfter method"+pastDate.isAfter(date));
		System.out.println(date.isAfter(pastDate));
		
		// Period is not date. Period only to define period of time is java.
		// You can add period to your date.
		Period period = Period.ofDays(3);
	//	System.out.println(period);
		date=date.plus(period);
		System.out.println(date);
		
		Period months = Period.ofMonths(3);
	//	System.out.println(months);
		Period year=Period.ofYears(5);
		Period weeks=Period.ofWeeks(4);
		// We paid every two weeks in the companies
		Period biweekly=Period.ofWeeks(2);
		Period fullPeriod=Period.of(1, 6, 20);
		System.out.println(fullPeriod+"========");
		Period bonus=Period.of(1, 2, 30);
		
		// In Period class you can not do method chaining
		// If you chain the method  java will compile and will not give runtime error.
		// When you chain in Period, Java will get last value.
		
	    Period period1 = Period.ofYears(1).ofWeeks(4).ofDays(6);
	    System.out.println(period1);
	   
	    
	    Period period2= Period.ofMonths(3).ofWeeks(2);
	    System.out.println(period2);
	    
	    // we can use Period only with LocalDate and LocalDateTime.
	    
	    LocalDateTime dateTime=LocalDateTime.of(2002, 06, 25, 12, 45);
	    // Every 2 weeks you will get paid.
	    // How many weeks I get paid until now.
	    Period twoWeek=Period.ofWeeks(2);
	    LocalDateTime currentDateTime=LocalDateTime.now();
	    
	    // While dateTime is before the curentDateTime
	    // add two weeks period and increase the dateTime
	    
	    int count=0;
	    
	    while(dateTime.isBefore(currentDateTime)) {
	    	count++;
	    	dateTime=dateTime.plus(twoWeek);
	    	
	    }
	    System.out.println(dateTime);
	    System.out.println(count);
	    
	    
	    LocalDate old = LocalDate.of(2005, Month.DECEMBER, 13);
	    LocalDate newD = LocalDate.of(2018, 8, 22);
	    Period changeOil=Period.ofMonths(3);
	    System.out.println(findPeriod(old,newD,changeOil));
	    
	    
	    System.out.println(findPeriod(LocalDate.of(2005, Month.DECEMBER, 13),
	    		LocalDate.of(2018, 8, 22),
	    		Period.ofMonths(3)));
	    
	    
	    /*
	     * Task
	     * If you consider you are changing the shoes very 6 months
	     * find how many times you bought or changed
	     * your shoes between
	     */
	     System.out.println(findPeriod(LocalDate.of(2005, Month.DECEMBER, 13),
	    		LocalDate.of(2018, 8, 22),
	    		Period.ofMonths(6)));
	    
	 
	  
	    /*
	     * Task2
	     * Every one year, 8 months, 23 day you are going to different country for travel
	     * Between old date and new Date how many time you went to different country.  
	     */
	    
	        LocalDate oldDate = LocalDate.of(2005, Month.DECEMBER, 13);
		    LocalDate newDate = LocalDate.of(2018, 8, 22);
		    Period vacationPeriod=Period.of(1, 8, 23);
		    System.out.println(findPeriod(old,newD,vacationPeriod));
	     
	    
	    // Other Methods in LocalDate, LocalTime and LocalDateTime to get the only specific part
	    LocalDateTime dateTime1=LocalDateTime.now();
	    System.out.println(dateTime1.getDayOfMonth());
	    System.out.println(dateTime1.getDayOfYear());
	    System.out.println(dateTime1.getHour());
	    System.out.println(dateTime1.getMinute());
	    	    
	    
	}

}
