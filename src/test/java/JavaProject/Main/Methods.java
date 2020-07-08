package JavaProject.Main;

public class Methods {
	
	/**
	 * Write an implementation for below method,
	 * method accepts three double parameters and returns double
	 * Mathod will accept balance, trasaction and deposit amount 
	 * and calculates what is new balance and return it
	 * Example:
	 * 		80 balance, 50, transaction, 10 deposit
	 *      return 40
	 * 
	 * @param balance
	 * @param transaction
	 * @param deposit
	 * @return
	 */
	
	public double getBalance(double balance, double transaction, double deposit) {
		//TODO
		double result = balance - transaction + deposit;  
		return result;
	}
	
	/**
	 * Implement a method that will accept String as parameter
	 * with only two letters and returns boolean.
	 * Method will check if two letter parameter is having same letters
	 * For Example: aa -> true
	 * 				ab -> false
	 * 				cd -> false
	 * 				== -> true
	 * 				yu -> false
	 * 
	 * @param p
	 * @return
	 */
	
	public boolean sameTwoChars(String p) {
		
		p=p.toLowerCase();
		char firstLetter = p.charAt(0);
		char lastLetter = p.charAt(1);
		boolean result = firstLetter == lastLetter;
		return result;
	}
	
	/**
	 * Implement a method that will accept two String parameters
	 * and returns boolean.
	 * Method will check source String contains target String
	 * Example:
	 * 		source -> "I love Java"
	 * 		target -> "love "
	 * 		returns true;
	 * 
	 * 	    source -> "I want to be Software Development Engineer in Test"
	 * 		target -> "SDET"
	 * 		returns false;
	 * 
	 *      source -> "Playing soccer"
	 * 		target -> " soccer!"
	 * 		returns false;
	 * 
	 * @param source
	 * @param target
	 * @return
	 */
	
	public boolean containsWord(String source, String target) {
		//TODO
		boolean result = source.contains(target);
		return result;
	}
	
	/**
	 * Write an implementation for a method which accepts 
	 * one String parameter with at least two letters and return String.
	 * Method will replace firstChar with lastChar of the String
	 * and then returns it.
	 * Example: 
	 * 		learn -> nearl
	 * 		Text  -> texT
	 * 		Hi    -> iH
	 * 
	 * @param word
	 * @return
	 */
	
	public String replaceChars(String word) {
		//TODO
		int lenghtWord = word.length()-1;
		char firstLetter = word.charAt(0);
		char lastLetter = word.charAt(lenghtWord);
		
		//int b = word.lenght();
		//String c=""+word.charAt(b-1)+word.substring(1,b-1)+word.charAt(0);
		// 
		
		String result = word.replace(word.charAt(0),lastLetter);
		result = word.replace(word.charAt(lenghtWord),firstLetter);
		
		return result;
	}
	
	/**
	 * Write an implementation for below method
	 * which accepts two int's and return int.
	 * Method will if two numbers are equal
	 * then multiplies them and returns
	 * otherwise it will return the sum of two numbers.
	 * Example:
	 * 		5,6 -> 5+6 = 11;
	 * 		3,3 -> 3*3 = 9;
	 * 		10,2 -> 10+2 = 12;
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	
	public int multiplyOrSum(int num1, int num2) {
		//TODO
		if (num1==num2) {
			int multiply = num1*num2;
			System.out.println("num1,"+"num2"+ "->"+"num1+"+"num2"+ (multiply));
			return multiply;	
		}
		else {
			int sum = num1 +num2;
			System.out.println("num1,"+"num2"+ "->"+"num1*"+"num2"+ (sum));
			return sum;
		}
		
	}
	
	
	/**
	 * Implement a method that will accept int as parameter
	 * and returns boolean.
	 * Method will check if the number is prime number.
	 * Prime number: is greater than 1 and it can be 
	 * divided only by 1 and by itself.
	 * prime numbers: 2,3,5,7,11,13,17,19,23 ...
	 * 
	 * Example:
	 * 		if num = 3 method will return true
	 * 		if num = 23 method will return true
	 * 		if num = 6 method will return false
	 * 
	 * @param num
	 * @return
	 */
	public boolean isPrime(int num) {
		// TODO
		boolean num1 = num%2 !=0;
		boolean num2 = num%3 !=0;
		boolean num3 = num%5 !=0;
		boolean num4 = num%7 !=0;
		boolean num6 = num==2 || num==3 || num ==5|| num == 7;
		boolean result = (num1 && num2 && num3 && num4  && num>1) || num6 ;	
		
		return result;
		
		
		
		
	     //   boolean x =  (num > 1) && (num / num == 1) && (num/1==num) ;
		   // boolean y = num ==2 || num ==3 || num ==5|| num ==7;
			//boolean x = num > 1 || num %2 != 0 || num%3 !=0 || num%5 !=0 || num%7 !=0;
		//	System.out.println(x);		
		
		}
		
	}
//System.out.println(!x);
//"if num = "+ num +"method will return" +
//"if num = "+ num +"method will return" +