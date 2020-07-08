package ReplyIt.Homeworks;

import java.util.Arrays;

public class ArrayMethods {
	 public static String[] orderByLastName(String[] names) {
		 

		 String [][] newNames = new String[names.length][]; 
		 for(int i=0; i<names.length; i++) {
			 newNames[i]=names[i].split(" ");
		 }
		 
		 String [] newNames2 = new String[newNames.length];
			for(int i=0; i<newNames.length; i++) {
				newNames2[i] = newNames[i][1]+" "+newNames[i][0];
			}
		 Arrays.sort(newNames2);
			
		 String[][] newNames3 = new String[newNames2.length][];
		 for(int i=0; i<newNames2.length; i++) {
		 newNames3[i] = newNames2[i].split(" ");	
			}
		 
		 String[] newNames4 = new String[newNames3.length];
	     for(int i=0; i< newNames3.length;i++) {
		 newNames4[i]=newNames3[i][1]+" "+newNames3[i][0];
			}
		 
		 return newNames4;
	 }
	 
	 
	 public static void main(String[] args) {
		
		 ArrayMethods aRM = new ArrayMethods();
		 
		 String [] names = {"John Doe", "Sarah Clark", "Harsh Patel", "Philip Brown", "Mike Clark"};
		
		 System.out.println(Arrays.toString(aRM.orderByLastName(names)));
		

 }
}