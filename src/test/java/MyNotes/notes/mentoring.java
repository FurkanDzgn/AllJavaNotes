package MyNotes.notes;

public class mentoring {
	public static void main(String[] args) {
		
		System.out.println( getBiggestNum(34, 55));
		
		
//		int a=5;
//		int b=6;
//		System.out.println(b/a);
//		System.out.println(a/b);
//		if(b/a!=0) {
//			System.out.println("b is bigger num.");
//		}else {
//			System.out.println("a is bigger num.");
//		}
	}
	
	public static int getBiggestNum(int a, int b) {
		
		if(b/a!=0) 
			return b;
	   	else 
			return a;
			
	}	

}
