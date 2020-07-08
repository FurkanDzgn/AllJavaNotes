package Day27_Wrappers.Wrappers;

public class WrapperMethods {
	
	public static void main(String[] args) {
		
		int strValue = Integer.valueOf("123"); // String -> Integer -> int
		int strValue1 = Integer.parseInt("123"); // String -> int
		
		//====================
		
		String number = "129"; // -> 921
		Integer number2 =Integer.valueOf(number);
		System.out.println(number2);
	//	System.out.println(Integer.reverse(Integer.parseInt(number)));
		
		System.out.println(Integer.max(10, 20));
		System.out.println(Integer.min(1, 2));
		
		System.out.println(Integer.compare(5, 6)); // If they are not equal returns -1 or 1 , if equal 0
		System.out.println(Integer.compare(6, 5)); // return 1
		System.out.println(Integer.compare(5, 5));
		// true, false  -> 0, -1
		
 		System.out.println(Integer.SIZE);
 		System.out.println(Character.SIZE);
		
 		
 	  //====================
 	   //----- reverse -------
 		
 	  // int to String
 	  // String to StringBuilder
 	  // StringBuilder to String
 	  //String to int
		int value = 123456;
		
		String strVal= value+"";
		
		StringBuilder reversed = new StringBuilder(strVal).reverse();
	//	reversed.reverse();
		
		int reversedInt = Integer.valueOf(reversed.toString());
		
		System.out.println(reversedInt);
		
		Character value3 = new Character('G');
		char charValue = value3; // Character -> char ======> unboxing
		System.out.println(charValue);
	}

}
