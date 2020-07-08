package Day10_IfStatements.TernaryOperator;

public class Example2 {
	public static void main(String[] args) {
		
		int x=5;
		int y=2;
		String value="Java";
		                                    // this part of code will not executed.
		int num = value.equals("Java") ? x++ : y++ ;
		System.out.println(num);
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("--------------");
		int num1 = value.equals("java") ? x++ : y++ ;
		System.out.println(num1);
		System.out.println(x);
		System.out.println(y);
	}

}
