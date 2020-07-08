package Day22_StringBuilder.lesson;

public class MyNoteEquality {
	public static void main(String[] args) {
		
		StringBuilder x = new StringBuilder("year");
		StringBuilder x1 = new StringBuilder("year");
		String x2 = "year";
		String x3 = new String("year");
		
		System.out.println(x == x1);
		System.out.println(x.toString() == x2);
		System.out.println(x.toString() == x3);
		
		System.out.println(x.toString().equals(x2));
		System.out.println(x.equals(x2));
		System.out.println(x.equals(x3));
		
		System.out.println(x2 == x3);
		System.out.println(x2.equals(x3));
	}

}
