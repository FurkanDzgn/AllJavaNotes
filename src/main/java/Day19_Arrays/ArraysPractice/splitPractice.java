package Day19_Arrays.ArraysPractice;

import java.util.Arrays;

public class splitPractice {
	public static void main(String[] args) {
		
		String description="It will give you expected sum of this squance";
      
		String[] arr=description.split(" "); //--> regex(regular expression);
		
		System.out.println(Arrays.toString(arr));
		
		String descr="It,will,give,you,expected,sum,of,this,squance";
		 // CSV --> Comma Seperated Values
		 // personNames.csv
		String[] arr2=description.split(",");
		
		System.out.println(Arrays.toString(arr2));
		
		String descr2="It.will.give.youe.expected.sum.of.this.squance";
		
		String[] arr3=description.split("\\.");
		System.out.println(Arrays.toString(arr3));
		
		String name1="Tech";
		String name2="Tech";
		System.out.println(name1==name1);
		System.out.println(name1.equals(name2));
		
	}

}
