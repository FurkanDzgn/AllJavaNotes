package ReplyIt.Homeworks;

import java.util.Arrays;

public class ArraysMethodMain {
	 public static void main(String[] args) {
			
		 String [] names = {"John Doe", "Sarah Clark", "Harsh Patel", "Philip Brown", "Mike Clark"};
		
		 String [][] newNames = new String[names.length][]; 
		 for(int i=0; i<names.length; i++) {
			 newNames[i]=names[i].split(" ");
		 }
	//	 System.out.println(newNames[0][0]);
		
		String [] newNames2 = new String[newNames.length];
		for(int i=0; i<newNames.length; i++) {
			newNames2[i] = newNames[i][1]+" "+newNames[i][0];
		}
	//	System.out.println(Arrays.toString(newNames2));
		 
		Arrays.sort(newNames2);
		System.out.println(Arrays.toString(newNames2));
		
		String[][] newNames3 = new String[newNames2.length][];
		for(int i=0; i<newNames2.length; i++) {
			newNames3[i] = newNames2[i].split(" ");	
		}
	//  System.out.println(newNames3[1][1]);
	
		String[] newNames4 = new String[newNames3.length];
		for(int i=0; i< newNames3.length;i++) {
			newNames4[i]=newNames3[i][1]+" "+newNames3[i][0];
		}
		System.out.println(Arrays.toString(newNames4));

	}

}



