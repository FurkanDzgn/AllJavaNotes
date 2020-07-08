package Day06.StringMethods;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		
		// You want to driver license
		// can drive the car, 16+, road rules
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Can you drive a car? Yes/No");
		String driveResult=input.next();
		
		boolean canDrive = driveResult.equalsIgnoreCase("Yes");
		System.out.println("What is your age? ");
		int age = input.nextInt();
		
		boolean ageLimit = age>=16;
		
                        //true && true -> true
		                //true && false -> false
		               //false && true -> false
		               //false && fasle -> false
		boolean result = canDrive && ageLimit;
		
		System.out.println("You can get your driver's licence: "+result);
		
		// && -> means both conditions has to be true in order to get true result
		// if one of them or both of them are false then you get false
		
		// || -> or
		
	}

}
