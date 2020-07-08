package CondingBat.codePractice;

import java.util.Arrays;

public class Array3 {
	
	public int maxSpan(int[] nums) {
		
		int max=0;
		
		for(int i=0; i<nums.length; i++) {
			int y = nums.length-1;
			
			while(nums[i]!=nums[y]) {
				y--;
			}
			
			int span = y-i+1;
			
			if(span>max) {
				max=span;
			}
		}
		
		return max;
	}
	
	
	public int[] fix34(int[] nums) {
				
		for(int i=0; i<nums.length;i++) {
			if(nums[i]==3) {
				for(int y=i+1;y<nums.length;y++) {
					if(nums[y]==4) {
						int temp=nums[i+1];
						nums[i+1]=temp;
						nums[y]=nums[i+1];
					}
				}
			}
		}
		
		return nums;
	}
	
	
	public int[] fix45(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i]==4) {
				for(int y=i; y<nums.length; y++) {
					if(nums[y]==5) {
						int temp = nums[i+1];
						nums[i+1]=nums[y];
						nums[y]=nums[i+1];
					}
				}
			}else if(nums[i]==5) {
				for(int y=i; y<nums.length; y++) {
					if(nums[y]==4) {
						int temp = nums[y+1];
						nums[y+1]=nums[i];
						nums[i]=temp;
					}
				}
			}
		}
		
		return nums;
	}
	
	
	public int[] squareUp(int n) {
	 	
		
		int x=n*n-1;
		int z=n;
		int s=0;
		int[] arr=new int[n*n];
		
		for(int i=0; i<n; i++) {
			int q=1;
			for(int a=0; a<n; a++) {
				
				arr[x]=q;
				x--;
				q++;
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Array3 aa = new Array3();
		
		int[] nums = new int[] {1, 4, 2, 1, 4, 1, 4};
		System.out.println(aa.maxSpan(nums));
		
		System.out.println(Arrays.toString(aa.squareUp(3)));
		
		System.out.println(Arrays.toString(seriesUp(3)));
	}
	
	public static int[] seriesUp(int n) {
		  
		int[] arr = new int[n*(n+1)/2];
		int x=0;
		
		for(int i=1; i<=n; i++) {
			
			
			for(int k=1; k<=i; x++,k++) {
				arr[x]=k;
			}
		
		}
	
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
