package ReplyIt.Recap;

public class ReverseInt {
	
	public static int way1(int num) {
		
		StringBuilder str = new StringBuilder(String.valueOf(num));
		str.reverse();
		int res=Integer.parseInt(str.toString());
		return res;
	}
	
	public static int way2(int num) {
		
		int digit=0;
		int rev=0;
		int num2=num;
		
		while(num!=0) {
		
			rev*=10;
			rev+=num%10;
			num=num/10;	
		}
		
		return rev;
	}
	public static void main(String[] args) {
		System.out.println(way1(123));
		System.out.println(way2(-123));
	}

}
