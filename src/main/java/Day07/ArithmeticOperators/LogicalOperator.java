package Day07.ArithmeticOperators;

public class LogicalOperator {
	
	// &&
	// ||
	// &
	// |
	
	public static void main(String[] args) {
		
		int result = 12 | 55;
		// | -> binaryCode operation
		// 32 16 8 4 2 1
		// 0   0 1 1 0 0 -> 12
		// 1   1 0 1 1 1 -> 55
		// 1   1 1 1 1 1 -> 63
		int result2 = 12 | 4; // | is bitwise
		// 32 16 8 4 2 1
		// 0   0 1 1 0 0 -> 12
		// 0   0 0 1 0 0 -> 4
		// 0   0 1 1 0 0 -> 12
		
		int result3 = 12 & 4; // & is bitwise
		// 32 16 8 4 2 1
		// 0   0 1 1 0 0 -> 12
		// 0   0 0 1 0 0 -> 4
		// 0   0 0 1 0 0 -> 4
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

}
