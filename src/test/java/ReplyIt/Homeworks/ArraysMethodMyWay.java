package ReplyIt.Homeworks;

import java.util.Arrays;

public class ArraysMethodMyWay {
	/*
	 * Implement orderByLastName method which will accept full name of employees and will return array of String sorted with last name:
	 * Example:
     *  {"John Doe", "Sarah Clark", "Harsh Patel", "Philip Brown", "Mike Clark"}
     *  return: { "Philip Brown", "Mike Clark", "Sarah Clark", "John Doe", "Harsh Patel"}
	 */
	
	/*
	 * create new array with 2 dimension use split.
	 * 
	 */
	   public static String[] orderLstName(String[] names) {
		   
		   String[][] name = new String[names.length][];
		   
		   for(int i=0; i<names.length; i++) {
			   name[i]=names[i].split(" ");
			   }
		   
//	        int i=0;	
//		   for (String [] name1:name) {	  
//			   name1[i]=name[i][1]+name[i][0];
//			   i++;
//			   System.out.println(Arrays.toString(name1));
//		   }
//		   Arrays.sort(name1);
		   
		   String [] name1=new String[name.length];
		   for(int i=0; i<name.length; i++) {
			   name1[i]=name[i][1]+" "+name[i][0];
		   }
		   Arrays.sort(name1);
		   
		   String[][] name2 = new String[name1.length][];
		   for(int i=0; i<name1.length; i++) {
			   name2[i]=name1[i].split(" ");
		   }
		   
		   String[] name3 = new String[name2.length];
		   for(int i=0; i<name2.length; i++) {
			   name3[i]=name2[i][1]+" "+name2[i][0];
		   }
		      
		   return name3;
	   }
	   public static String[] orderName(String[] names) {
		   
		   for(int i=0; i<names.length; i++) {
			   int space=names[i].indexOf(" ");
			   names[i]=names[i].substring(space+1)+" "+names[i].substring(0,space);
		   }
		   
		   Arrays.sort(names);
		   
		   for(int i=0; i<names.length; i++) {
			   int space=names[i].indexOf(" ");
			   names[i]=names[i].substring(space+1)+" "+names[i].substring(0,space);
		   } 
		   return names;
	   }
	   
	   
	   
	   public static void main(String[] args) {
		
		   String [] arr = new String[] {"John Doe", "Sarah Clark", "Harsh Patel", "Philip Brown", "Mike Clark"};
		   System.out.println(Arrays.toString(orderLstName(arr)));
		   
		   System.out.println(Arrays.toString(orderName(arr)));
	}
	
}
