package Day15_Arrays.PracticeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Colors {
	public static void main(String[] args) {
		String[] colors = {"White","Blue","Red","Green"};
		
		System.out.println(Arrays.toString(colors));
		
		colors [3]="Black";
		System.out.println(Arrays.toString(colors));
		
		colors[1]=colors[2];
		System.out.println(Arrays.toString(colors));
	    
		// Arrays can store duplicate values
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the color: ");
		String color = input.next();
		
		for (int i=0; i<colors.length; i++) {
			if(colors[i].equalsIgnoreCase(color)) {
				System.out.println("Entered color is in Array.");
			    break;
			} else if(i==colors.length-1) { // 3==3
			System.out.println("Entered color is not in Array");
			}
	}
	}
}
