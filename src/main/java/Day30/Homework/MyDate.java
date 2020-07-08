package Day30.Homework;

import java.util.List;
import java.util.Arrays;

public class MyDate {
	
	/**
     * Create three int instance variables: day, month and year
     * Initialize them in below constructor.
     * 
     */
	
	int month;
	int day;
	int year;
	
    public MyDate(int month, int day, int year) {
    	this.month=month;
    	this.day=day;
    	this.year=year;
    }
    
    /**
     * Write an implementation for below method, 
     * this method will accept MyDate object
     * and will print the date as in example;
     * For example:
     *      new MyDate(4,2,2020); -> returns "April Two Two Thousand Twenty";
     * 
     * @param date
     * @return
     */
    
    public static String printDate(MyDate date) {
        List<String> monthWords = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December");
        List<String> numbersLessThanTen = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");
        List<String> numbersBetweenTenAndTwenty = Arrays.asList("Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen");
        List<String> multiplesOfTen = Arrays.asList("Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety");
        List<String> yearWords = Arrays.asList("Hundred", "Thousand");
        
        String result = "";
      
       result+=monthWords.get(date.month-1)+" ";
        
       if(date.day<=10 && date.day>=1) 
        result+=numbersLessThanTen.get(date.day-1)+" ";
       if(date.day<=19 && date.day>=11)
    	   result+=numbersBetweenTenAndTwenty.get(date.day%10-1)+" ";
      
       if(date.day<=31 && date.day>=20) {
    	   String dayDate = String.valueOf(date.day);
    	   int dayDate2=Integer.parseInt(dayDate.substring(0,1));
    	   int dayDate3=Integer.parseInt(dayDate.substring(1));
    	   if(dayDate2==2) {
    		   result+=multiplesOfTen.get(1)+" "+numbersLessThanTen.get(dayDate3-1)+" ";
    	   }else {
    		   result+=multiplesOfTen.get(2)+" "+numbersLessThanTen.get(dayDate3-1)+" ";
    	   }
       }
       
       String dayYear = ""+date.year;
       int dayYear2 = Integer.parseInt(dayYear.substring(0,1));
       result+=numbersLessThanTen.get(dayYear2-1)+" "+yearWords.get(1)+" ";
       int dayYear3 = Integer.parseInt(dayYear.substring(1,2));
       if(dayYear3>0) {
    	   result+=numbersLessThanTen.get(dayYear3-1)+" "+yearWords.get(0)+" ";
       }
       int dayYear4 = Integer.parseInt(dayYear.substring(2,3));
       int dayYear5 = Integer.parseInt(dayYear.substring(3));
       int dayYear6 = Integer.parseInt(dayYear.substring(2));
       if(dayYear4==0 && dayYear5!=0) {
    	   result+=numbersLessThanTen.get(dayYear5-1)+" ";
       }else if(dayYear5==0 && dayYear4!=0) {
    	   result+=multiplesOfTen.get(dayYear4-1);
       }else if(dayYear4==1 && dayYear5 <=9) {
    	   result+=numbersBetweenTenAndTwenty.get(dayYear6%10-1)+" ";
       }else if(dayYear4>=1 && dayYear5==0) {
    	   result+=multiplesOfTen.get(dayYear4-1)+" ";
       }else if(dayYear4>=1 && dayYear5>=1) {
    	   result+= multiplesOfTen.get(dayYear4-1)+" "+numbersLessThanTen.get(dayYear5-1);
       }
       	  
        return result;
    }
    
    public static void main(String[] args) {
                	
        MyDate date = new MyDate(5,10,2019);
        System.out.println("Expected: "+printDate(date));
        System.out.println("Actual:   May Ten Two Thousand Nineteen\n");
        
        MyDate date2 = new MyDate(1,5,2010);
        System.out.println("Expected: "+printDate(date2));
        System.out.println("Actual:   January Five Two Thousand Ten\n");
        
        MyDate date3 = new MyDate(10,18,2000);
        System.out.println("Expected: "+printDate(date3));
        System.out.println("Actual:   October Eighteen Two Thousand\n");
        
        MyDate date4 = new MyDate(12,31,1919);
        System.out.println("Expected: "+printDate(date4));
        System.out.println("Actual:   December Thirty One One Thousand Nine Hundred Nineteen\n");
        
        MyDate date5 = new MyDate(12,25,1995);
        System.out.println("Expected: "+printDate(date5));
        System.out.println("Actual:   December Twenty Five One Thousand Nine Hundred Ninety Five\n");
        
        System.out.println("ALL BELOW EXPECTED AND ACTUAL PRINTS HAS TO MATCH.\n");
        
    }

}
