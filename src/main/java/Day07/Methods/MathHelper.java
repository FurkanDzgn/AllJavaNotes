package Day07.Methods;

public class MathHelper {
	public int multiplyTwo(int num) {
		int result = num*2;		
		return result;	
		
	}
	public static void main(String[] args) {
		MathHelper mh = new MathHelper();
		
		int result= mh.multiplyTwo(10); // 10 -> 10*2 -> 20
		System.out.println(result);
		
		int result2 = mh.addTen(5);
		System.out.println(result2); // 5 -> 5+10 -> 15
		
		int result3 = mh.sum(5,6);
		System.out.println(result3); // 5,6 -> 5+6 -> 11
		
	}
	public int addTen(int num2) {
		int addTen = num2 +10;
		return addTen;
	}
	
	//Create a method with name sum
	//which will accept two int parameters and will return int
	//as sum of these two numbers
    
	public int sum(int num3 , int num4) {
		int sum = num3+num4;
		return sum;
	}
}

