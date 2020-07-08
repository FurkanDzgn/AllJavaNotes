package Day16_Arrays.PracticeArrays;

public class FindSum {
	public static void main(String[] args) {
		
		int[] nums = {2,7,11,22};
		int target = 18;
		
		//7,11 -> 1, 2
		
		StartLoop:
			for(int i=0; i<nums.length; i++) {
			SecondLoop:
				for(int y=0; y<nums.length; y++) {
				if(i!=y && nums[i]+nums[y]==target) {
					System.out.println(i+","+y);
					break StartLoop;
				}
				
					
			}
		}
	}

}
