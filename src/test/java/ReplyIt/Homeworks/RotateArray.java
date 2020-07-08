package ReplyIt.Homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter length");
		int w = input.nextInt();
		
	
		int[] nums = new int[w] ;
        	
		System.out.println("Arrays variables:");
		for(int i=0; i<w; i++) {
		 nums[i] = input.nextInt();
		}
		
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		System.out.println("Enter k");
		int k = input.nextInt();
		
		int[] rotateArray = new int[w];
			
		int x=nums.length-k;
		if(k<nums.length) {
			for( int i=0; x<nums.length; x++) {
				rotateArray[i]=nums[x];
				i++;
			}
			System.out.println(Arrays.toString(rotateArray));
		    
			int b=nums.length-k;
		    
		    for(int a=0; b>a ; a++) {
		    	rotateArray[k]=nums[a];
		    	k++;
		    }
		    
		    System.out.println(Arrays.toString(rotateArray));
		
		
		}
			
	}

}
