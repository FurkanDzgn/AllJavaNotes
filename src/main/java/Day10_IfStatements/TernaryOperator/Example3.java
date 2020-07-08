package Day10_IfStatements.TernaryOperator;

public class Example3 {
	public static void main(String[] args) {		
		int result = (5==5) ? (2==2) ? 1:2:3;
		System.out.println(result);
		
		System.out.println("--------");
		
		int result1 = (5==6) ? (2==2) ? 1:2:3;
		System.out.println(result1);
		
		System.out.println("--------");
		
		int result2 = (5==5) ? (2==3) ? 1:2:3;
		System.out.println(result2);
		
		System.out.println("--------");
		
		int result4 = (5>5) ? (2==2) ? 1:2:3;
		System.out.println(result4);
		
		/*
		 * condition
		 * expression 1
		 * expression 2		 
		 * We can create many condition and expression
		 */
		
		
		
	}

}
