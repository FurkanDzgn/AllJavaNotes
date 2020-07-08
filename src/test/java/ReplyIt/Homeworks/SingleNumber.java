package ReplyIt.Homeworks;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		
		int numbers=0;
	
		OUTHERLOOP:
		for(int i=0; i<nums.length; i++) {
			INNERLOOP:
			for(int a=0; a<nums.length; a++) {
				if(nums[i]==nums[a] && i!=a) {		
					continue OUTHERLOOP;	
				}
			}
		       numbers=nums[i];
		}
		return numbers;
   }
	
	public static int singleNum(int[] nums) {
		/*
		 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
		 * 
		 * Input: [4,1,2,1,2]
         *  Output: 4
		 */
		int result=0;
	OUTHERLOOP:
		for(int i=0; i<nums.length; i++) {
	INNERLOOP:
		for(int x=0; x<nums.length; x++) {
		     if(nums[i]==nums[x] && i!=x) {
					continue OUTHERLOOP;
				}
			}
		result=nums[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		SingleNumber sN  = new SingleNumber();
		
		int nums [] = {2,2,3,4,9,4,3};
		
		System.out.println(sN.singleNumber(nums));
		
		System.out.println(singleNum(nums));
		
		System.out.println(6%5);
		
		int a=2;
		String x="";
		
		x=String.valueOf(a);
		System.out.println(x.length());
		
	}
}