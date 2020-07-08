package Day23_StringBuilder.SB;

public class SBMethods07 {
	public static void main(String[] args) {
		
		StringBuilder stb = new StringBuilder("Programming");
		
	//	stb.append("Java");
		
		// 1) insert();
		stb.insert(0, "Java ");
		System.out.println(stb);
		
		// Java - Programming
		stb.insert(5, "- ");
		System.out.println(stb);
		
		// 2) delete();  --> will delete specific part of your stb
		
		// Java - Programming
		stb.delete(5,7); // 7 will not included
		System.out.println(stb);
		
		//reverse(); --> this method only in StringBuilder
	 //	System.out.println(stb.reverse());
		
		
		System.out.println(stb.charAt(0));
		System.out.println(stb.indexOf("m"));
		System.out.println(stb.substring(0,4));
		
		System.out.println(("================="));
		
		// compareTo();
		StringBuilder stb1 = new StringBuilder("Computer");
		StringBuilder stb2 = new StringBuilder("Computer");
		StringBuilder stb3 = new StringBuilder("Laptop");
		
		System.out.println(stb1.compareTo(stb2)); // 0 --> same
		System.out.println(stb1.compareTo(stb3)); // negative number --> different
		
		
		
		// convert from String to StringBuilder,,,after  convert from StringBuilder to String
		String name ="David";
	    
		StringBuilder stb4 = new StringBuilder(name);	
	    
	    String reversed = stb4.reverse().toString();
	    System.out.println(reversed);
		
		
	}

}
