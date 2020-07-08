package Day20_InterviewQuestions.Practice;

import java.util.Arrays;

public class reverseArray {
	public static void main(String[] args) {
		
		String [] arr= {"Arslan","Muammer","Tima","Kumar"};
		
		String [] rewarr=new String[arr.length];
		for(int i=0; i<arr.length; i++) {	
			String reversed="";
			int leng=arr[i].length()-1;
			for(; 0<=leng;leng--) {
			reversed+=arr[i].charAt(leng);
			}
			rewarr[i]=reversed;
		}
		System.out.println(Arrays.toString(rewarr));
	}

}
