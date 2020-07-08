package Day20_InterviewQuestions.Practice;

import java.util.Arrays;

public class sumOfArray {
	public static void main(String[] args) {
		
		int[] arr= {3456,2435,765,6776};
		
		int[] arr2=new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			int sum=0;
			for(;arr[i]!=0;) {
				sum+=arr[i]%10;
				arr[i]=arr[i]/10;	
			}
			arr2[i]=sum;
		}
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("============");
		
		int[] array= {3456,2435,765,6776};
		int sumArray[]=new int[array.length];
		
		for(short i=0; i<array.length; i++) {
			int number=array[i];
			int sum=0;
			while(number>0) {
				int digit=number%10;
				sum+=digit;
				number/=10;
			}
			sumArray[i]=sum;
		}
		
		System.out.println(Arrays.toString(sumArray));
		
		
		
	}

}
