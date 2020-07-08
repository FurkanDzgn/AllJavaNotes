package Day20_InterviewQuestions.Practice;

public class lesson1 {
	public static void main(String[] args) {
       int number=12345;
		
		int num=number;
		int count=0;
		
		for(int i=0; num!=0; i++) {
			num/=10;
			count++;
		}
		
		int sum=0;
		for(int i=0; i<count; i++) {
			sum+=number%10;
			number=number/10;
		}
		System.out.println(sum);
		
		System.out.println("===================");
		
		int number2=5678;
		
		int sum2=0;
		
		while(number2>0) {
			
			int digit=number2%10;
			sum2+=digit;
			number2/=10;
			
		}
	
		System.out.println(sum2);
		
		System.out.println("===========");
		System.out.println(recap(123456));
		System.out.println(recapReverse(123456));
		
	}	
	
	public static int recap(int num) {
		
		int x=num;
		int count=0;
		
		while(x!=0) {
			x=x/10;
			count++;
		}
		int sum=0;
		for(int i=0; i<count; i++) {
			sum=sum+num%10;
			num/=10;
		}
		
		return sum;
	}
	public static int recapReverse(int num) {
		
  //   	int x = num;
     	int result=0;
     	
     	while(num!=0) {
     		result*=10;
     		result+= num %10;
     		num /=10;
     	}
     	return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
