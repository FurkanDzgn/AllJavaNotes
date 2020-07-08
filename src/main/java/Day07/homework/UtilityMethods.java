package Day07.homework;

import java.util.Scanner;

public class UtilityMethods {

       public boolean firstLastCharIsSame(String name) {
    	   
    	   int lastIndex=name.length()-1;
    	   char lastChar=name.charAt(lastIndex);
    	   int firstChar=name.charAt(0);    
    	   boolean result = firstChar==lastChar ; //true
    	   return result;
       }
       public static void main(String[] args) {
    	   UtilityMethods flc = new UtilityMethods();
    	   Scanner input=new Scanner(System.in);
    	   String name =input.nextLine();
    	   
    	   boolean result=flc.firstLastCharIsSame("name");
    	     
    	   System.out.println("firstLastChars " +  "(�"+name+"�)"  +" -> "+result);
   	   
    	   String name2=input.nextLine();
     	   String  x = flc.initials(name2);
    	   System.out.println("initials" +  " (�" + name2 +"�) "+"will return"+"->"+x);
	}
          public String initials (String name2) {
    	   
    	   char initials = name2.charAt(0);
    	   int lastName=name2.indexOf(' ');
    	   char x= name2.charAt(lastName+1);
           String result=""+initials+x; //Because char + char = int
    	   return result;
    	      
//           String firstLetter = name2.substring(0,1).toUpperCase();
//           String lastLetter = name2.toUpperCase().substring((name2.indexOf(" "))+1,(name2.indexOf(" "))+2);
//    	   String fullName=firstLetter
//    	   
    	   
    	   
    	   
    			   
       }
       
}
