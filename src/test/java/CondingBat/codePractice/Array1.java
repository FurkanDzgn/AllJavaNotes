package CondingBat.codePractice;

public class Array1 {
	public static int maxTriple(int[] nums) {
		  
		  int temp=nums[0];
		  for(int i=1; i<nums.length; i++){
		    if(nums[i]>temp){
		      temp=nums[i];
		     }
		    }
		  
		  return temp; 
		}
	public static void main(String[] args) {
		
		int[] nums= {1, 7, 3, 1, 5};
		System.out.println(maxTriple(nums));
	}

}
