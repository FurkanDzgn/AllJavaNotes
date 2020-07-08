package Day15_Arrays.PracticeArrays;

import java.util.Arrays;

public class DefaultValuesOfString {
	public static void main(String[] args) {
		
		String[] names = new String[5];
		
		names[0]="Patel";
		names[1]="Saravanan";
		names[2]="Ramamohanda";
		
		System.out.println(Arrays.toString(names)); 
		//String default value will be null
		
		String[] letters = new String[] {"A","B","C"};
		
		System.out.println(letters[2]);
		System.out.println(letters.length);
		
		// What is the diffrence between length() and length
		// length() -> Is used to get number of characters in String
		// length -> is used to get number of elements in array
		
		char[] ch = new char[] {'z','y','x'};
		System.out.println(Arrays.toString(ch));
		
		char[] ch2 = new char[5];
		System.out.println(Arrays.toString(ch2));
		
		boolean[] conditions = new boolean[] {true, false, true, false}  ;
		System.out.println(Arrays.toString(conditions));	
		
		String variables = Arrays.toString(conditions);
		System.out.println(variables);
		
		System.out.println(Arrays.toString(new int[] {5,3,4,21}));
	}

}
