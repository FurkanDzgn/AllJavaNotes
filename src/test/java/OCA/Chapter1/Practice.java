package OCA.Chapter1;

public class Practice {
	private static int $;
	
	public static void addToInt(int x, int y) {
		 x = x+y;
	}
	public static void main(String[] args) {
		String a_b;
		System.out.println($); // default 0;
   //	System.out.println(a_b); // compile error
		
		
		System.out.println("============");
		
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
	//	System.out.println(sb1 == s1); compile error
		System.out.println(sb1.toString().equals(s1));
		System.out.println("==============");
		int x=15;
		int y=10;
		
		Practice.addToInt(x, y);
		System.out.println(x);
	}
	
	

}
