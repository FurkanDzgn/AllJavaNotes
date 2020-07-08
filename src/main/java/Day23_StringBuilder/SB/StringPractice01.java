package Day23_StringBuilder.SB;

public class StringPractice01 {
	
	public static void main(String[] args) {
		
		System.out.println("==============String is Immutable================");
		
		String str = "tech";
		String str2 = str;
		
		System.out.println(str.equals(str2)); // true
		System.out.println(str==str2); // true
		/*
		 * Stack is store only references (str -- str2)
		 */
		
		System.out.println(str+"\n"+ str2);
		
		str="tutorial";
		
		System.out.println(str+"\n"+ str2);
		
		
		// "Welcome" , " back" , "Welcome back" , " home!" , "Welcome back home!" ---> these are created in String Pool
		String str3 ="Welcome";
		str3 = str3 + " back";
		str3 = str3 + " home!";
		
		System.out.println(str3);
		
	                 //    1      2       3           4
		String sentence = "hi,"+" we"+" started"+" the classes!";
		
		// sentence --> "hi, we started the classes!"; --> 5 values created in String pool
		
		
		System.out.println("==============StringBuilder is Mutable================");
	
		//         references
		StringBuilder sb  = new StringBuilder("hi");
		StringBuilder sb2 = new StringBuilder("hi");
		StringBuilder sb3 = sb2;
		
		
	//	System.out.println(sb==sb2);//false
		System.out.println(sb.equals(sb2));//false
		System.out.println(sb3.equals(sb2));//true
	//	System.out.println(sb3==sb2);//true
		
		sb2.append(" bye");
		
		System.out.println(sb2);
		System.out.println(sb3); // sb3 use same value with sb2
		
//		sb3.append(" 2020");
//		
//		System.out.println(sb3);
//		System.out.println(sb2); 
		
		System.out.println(sb.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb3.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
