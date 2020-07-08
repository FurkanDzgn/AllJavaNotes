package Day18_Arrays.SplitPratice;

import java.util.Arrays;

public class SplitDate {
	
	public static void main(String[] args) {
		
		String date = "12/24-2019-2:45";
		
		String[] dateDetails = date.split("-");
	//	String[] dateDetails = date.split("/");
	//	String[] dateDetails = date.split(":");
		
		System.out.println(dateDetails.length);
	//	System.out.println(Arrays.toString(dateDetails));
	//	System.out.println(dateDetails[1]);
		
		for(int i=0; i<dateDetails.length; i++) {
			System.out.println(dateDetails[i]);
		}
		
		System.out.println("The year is "+dateDetails[1]);
	}

}
