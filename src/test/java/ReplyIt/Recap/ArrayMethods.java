package ReplyIt.Recap;

import java.util.Arrays;

public class ArrayMethods {
	
	public static String[] orderByLastName(String[] names) {
		
		String [][] arr = new String[names.length][];		
		for(int i=0;i<names.length;i++) {
			arr[i]=names[i].split(" ");
		}
		
		String[] arr2 = new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i][1]+" "+arr[i][0];
		}
		
		Arrays.sort(arr2);
		
		String [][] arr3 = new String[arr2.length][];
		for(int i=0;i<arr2.length;i++) {
			arr3[i]=arr2[i].split(" ");
		}
		
		String[] arr4 = new String[arr3.length];
		for(int i=0;i<arr3.length;i++) {
			arr4[i]=arr3[i][1]+" "+arr3[i][0];
		}
		
		return arr4;
	}
	public static void main(String[] args) {
	
		String[] arr = {"John Doe","Sarah Clark","Harsh Patel","Philip Brown","Mike Clark"};
		System.out.println(Arrays.toString(orderByLastName(arr)));
	}

}
