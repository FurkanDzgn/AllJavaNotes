package ReplyIt.Recap;

import java.util.Arrays;

public class Anagram {
	
	public static boolean meth(String str1, String str2) {
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(arr1.length==arr2.length) {
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i]!=arr2[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(meth("furkan", "kanfur"));
	}

}
