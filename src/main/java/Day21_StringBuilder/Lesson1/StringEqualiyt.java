package Day21_StringBuilder.Lesson1;

public class StringEqualiyt {
	
	public static void main(String[] args) {
		
		// if you are creating the string without new keyword 
		// the value will be stored inside the string pool
		//If you have same value, inside String pool
		//you will have only one instance of object
		
		String car="Mercedes";
		String car1="Mercedes";
		// creating the string with new keyword will be stored inside heap but outside of the String pool
		String car2=new String("Mercedes");
		
		
		// it will check both references are pointing 
		// to same object or not
		// if they same are pointing to same object it will
		// return true
		System.out.println(car==car1);//true
		System.out.println(car.equals(car1));//true
		System.out.println(car==car2); // false
		System.out.println(car.equals(car2)); // true
		
		// == sign in primitive compare the values
		
		int num=10;
		int num1=10;
		System.out.println(num==num1); // true
		
		String car3=car2;
		
		System.out.println(car2==car3); // true
		System.out.println(car3==car); // false
		System.out.println(car2.equals(car3));//true
		
		// we need to re-assign the value
		car1.substring(2);
		System.out.println(car1);
	    //	car1.charAt(10); // throws the exception
		car1.indexOf('k'); // return -1

		/*
		 * We are able to see the Mercedes because String is immutable
		 * If you do not re assign the value of String
		 * Using String methods will not change your original value
		 */
		
		StringBuilder absent=new StringBuilder('A');
		StringBuilder lates=new StringBuilder("A");
		String late="A";
		
		System.out.println(lates.equals(absent));//false
		System.out.println(lates==absent);//false
		
		System.out.println(late.equals(absent));//false
		System.out.println(absent.equals(late));//false
	//	System.out.println(late==absent);
		
		System.out.println(lates.equals(absent));//false
		System.out.println(absent.equals(lates));//false
		System.out.println(late.equals(lates)); // 
	//     System.out.println(absent.equals("A"));
	}

}
