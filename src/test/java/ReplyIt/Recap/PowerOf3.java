package ReplyIt.Recap;

public class PowerOf3 {
	public static boolean way1(int num) {
		
		if(num%3==0 && num%5!=0 && num%7!=0 && num%2!=0) {
			return true;
		}
		return false;
		
	}
	
	public static boolean way2(int num) {
		
		if(num==0)
			return false;
		
		while(num%3==0) {
			num/=3;
		}
		if(num==1) 
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		System.out.println(way1(33));
		System.out.println(way2(27));
	}
}
