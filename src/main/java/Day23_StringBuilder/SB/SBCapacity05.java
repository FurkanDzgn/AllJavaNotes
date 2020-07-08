package Day23_StringBuilder.SB;

public class SBCapacity05 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(5);
		
		sb.append("tech");
		System.out.println(sb.length()); // this is the size of sb
		System.out.println(sb.capacity()); // this is capacity of sb
		
		sb.append("torial");
		System.out.println(sb.length()); // this is the size of sb
		System.out.println(sb.capacity()); // this is capacity of sb , randomly calculate
	}

}
