package Day20_InterviewQuestions.Practice;

public class ProductNumber {
	public static void main(String[] args) {
		
		int number=12456;
		
		int num=number;
		int digit=0;
		int sum=0;
		for(int i=0; num!=0; i++) {
			digit=num%10;
			sum+=digit;
			num/=10;
			
		}
		System.out.println(sum);
		
		int num2=number;
		int digit2=0;
		int productnum=1;
		for(int i=0; num2!=0; i++) {
			digit2=num2%10;
			productnum*=digit2;
			num2/=10;
			
		}		
		
		int result=productnum-sum;
		System.out.println("Product Value "+ result);
		
		
		System.out.println("==============");
		
		int number3=12456;
		
		int sum3=0;
		int productNum3=1;
		
		while(number3>0) {
			
			int digit3=number3%10;
			sum3+=digit3;
			productNum3*=digit3;
			number3/=10;
		}
		
		int productValue3=productNum3-sum3;
		System.out.println("Product Value "+ productValue3);
		
		System.out.println(rec(12456));
		
	}
	
	public static int rec(int num) {
		
		int sum=0;
		int mult=1;
		int counter=0;
		
		while(num!=0) {
			
	        counter=num%10;
		    sum+=counter;
			mult*=counter;
			num/=10;
			
		}
		
		int result=mult-sum;
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
