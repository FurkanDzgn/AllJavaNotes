package Day07.ArithmeticOperators;

public class LogicalOperators2 {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		
		int x = 10;
		int y = 12;
		
		     // result = true || false -> true
		boolean result = a==b || x==++y; // skip pass of code,,,If find 1. part is true
		                                 //our code dont read other part of code
		
		System.out.println(result);
		System.out.println(y); // 12
		
		boolean result2 = a==b && x==++y;
		System.out.println(result2);
		System.out.println(y); // 13
		                 
		     // result3= 5==5(true) || we dont check second part
		boolean result3 = a==b++ || ++x == ++y;
		System.out.println(result3);
		System.out.println(x);
		System.out.println(b);
		
		    //  result4 = 5==6(false) || 11 == 13(false)
		boolean result4 = a==++b || ++x == ++y;
		System.out.println(result4);
		System.out.println(x);
		System.out.println(b);
	}

}
