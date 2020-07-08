package ReplyIt.Homeworks;

import java.util.Arrays;
//import java.util.Scanner;

public class RoteteArrayWithMethohds {
	
	  public int[] rotateArray2(int[] nums, int k ){
		   
		// Arrays.sort(nums);

			int[] rotateArray = new int[nums.length];
			
			  int cut =nums.length-k;
			  int i =0;
				for(; cut<nums.length; i++, cut++) {
					rotateArray[i]=nums[cut];
				}
			  
				cut = 0;
			    
			    for(; i<nums.length; i++, cut++) {
			    	rotateArray[i]=nums[cut];
			    }
			    
			
				
				return rotateArray;
			}
	
	
public int []  rotateArray (int[] nums, int k) {
		
//	Arrays.sort(nums);

	int[] rArray = new int[nums.length];
	if (k<0)
		k=0;
	int x=nums.length-k;
	if(k<nums.length ) {
		for( int i=0; x<nums.length; x++) {
			rArray[i]=nums[x];
			i++;
		}
	  
		
		int b=nums.length-k;
	    
	    for(int a=0; b>a ; a++) {
	    	rArray[k]=nums[a];
	    	k++;
	    }
	    
	}
		
		return rArray;
	}
public static void main(String[] args) {
	RoteteArrayWithMethohds rAWM = new RoteteArrayWithMethohds();
	
	int number [] = new int[] {1,2,3,5,9};
	
	 System.out.println(Arrays.toString( rAWM.rotateArray2(number,0)));  
	 System.out.println(Arrays.toString( rAWM.rotateArray(number,1)));
}

}
