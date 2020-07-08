package Day19_Arrays.ArraysPractice;

public class missingNumber {
	/*
	 * int num[] = {2,4,1,6,5,7};
	 * find missing number from this array without sorting
	 * 
	 * 1-create one method will take the parameter as int[]
	 * 
	 * Formula n*(n+1)/2
	 * 
	 * 7*8/2 --> it will give you expected sum of this sequence
	 *  1,2,3,4,5,6,7  -> sum of is equals to 28
	 *  
	 *  actual sum is equals 25
	 *  28-25=3 is missing number
	 * 
	 * 
	 */
	
	public static int recap(int[] num) {
		
		int temp=0;
		for(int i=0;i<num.length;i++) {
			
			if(num[i]>temp) {
				temp=num[i];
			}
		}
		int total = temp*(temp+1)/2;
		
		int sum=0;
		for(int i=0; i<num.length;i++) {
			sum+=num[i];
		}
		
		return total-sum;
	}
	
	
	
	public int misNum(int[] nums) {
		
         int x=nums[0];
         
		for(int i=1;i<nums.length; i++) {
			if(x<nums[i]) {
				x=nums[i];
			}
		}
		int misnum=0;
		for(int i=0; i<=x; i++) {
			boolean notfind=true;
			for(int a:nums) {
				if(i==a) {
					notfind=false;
				}
			}if(notfind==true) {
				misnum=i;
			}
		}
		return misnum;
	}
	public int missingNumber(int [] numbers) {
		
		int x=numbers[0];
        
		for(int i=1;i<numbers.length; i++) {
			if(x<numbers[i]) {
				x=numbers[i];
			}
		}
		
		int max=x;
		// i call largestValue method to find my largest value
		int expectedSum=max*(max+1)/2;
		
		int actualSum=0;
		for(int i=0; i<numbers.length;i++) {
			actualSum+=numbers[i];
		}
		
		return expectedSum-actualSum;
	}
	public static void main(String[] args) {
		missingNumber xxx=new missingNumber();
		
		int []numbers= {2,4,1,6,5,7};
		
		System.out.println(xxx.missingNumber(numbers));
		
		System.out.println(xxx.misNum(numbers));
		System.out.println(recap(numbers));
	}
	

}
