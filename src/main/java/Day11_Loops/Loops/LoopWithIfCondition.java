package Day11_Loops.Loops;

public class LoopWithIfCondition {
	public static void main(String[] args) {
		
		int num=100;
		
		do {
			if(num%2==0) {	
				System.out.print(num+", ");
			}
			--num;
		}while(num>0);
		
		//num =0;
		
		int num2=0;
		num=100;
		System.out.println();
		
		do {
			if(num2%2==0) {
				System.out.print(num2+", ");
			}
			
			++num2;
		}while(num>num2);
		
	}

}
