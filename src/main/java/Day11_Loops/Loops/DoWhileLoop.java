package Day11_Loops.Loops;

public class DoWhileLoop {
	public static void main(String[] args) {
		
		int num = 5;
		
		do {	
			System.out.println(num);
			--num;
		}while(num>0); //4>0 -> true 4,3>0 -> true 3,2>0 -> true 2,1>0 -> true 1,0>0 false
	}

}
