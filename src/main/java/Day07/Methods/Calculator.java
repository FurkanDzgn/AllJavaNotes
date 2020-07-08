package Day07.Methods;

public class Calculator {
	/*
	 * Write four methods with sum, subtract, multiply, divide
	 * which all of them will return int
	 * 
	 * sum -> will summarize two parameters
	 * subtract-> will minus two parameters
	 * multiply-> will multiply two parameters
	 * divide->will divide two parameters
	 */
     public int sum(int num1,int num2) {
    	 int result = num1+num2;
    	 return result;	 
     }  
     public int subtract(int num1,int num2) {
    	 int result = num1-num2;
    	 return result;
     }
     public int multiply(int num1,int num2) {
    	 int result = num1*num2;
    	 return result;
     }
     public double divide(double num1,double num2) {
    	 double result = num1/num2; // 10/3 ->3 -> 3.0 ,, 10.0/3.0 ->3.3333
    	 return result;
     }
     public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int sumResult = c.sum(3,4);
		System.out.println(sumResult);
	//	System.out.println(c.sum(3,4));
		
		int subtractResult = c.subtract(10, 5);
		System.out.println(subtractResult);
		
		int multiplyResult = c.multiply(2,3);
		System.out.println(multiplyResult);
		
		double divideResult = c.divide(10.3,3.5);
		System.out.println(divideResult);
		
	}
}
