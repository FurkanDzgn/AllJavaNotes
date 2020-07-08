package CondingBat.codePractice;

public class String3 {
	
	
	public int countYZ(String str) {
		
		if(str.length()==0) {
			return 0;
		}
		
		int counter =0;
		
		for(int i=0; i<=str.length()-2;i++) {
			if(( Character.toLowerCase(str.charAt(i))=='y' || Character.toLowerCase(str.charAt(i))=='z' ) && 
					!Character.isLetter(str.charAt(i+1)) ) {
				counter++;
			}
		}
			if(Character.toLowerCase(str.charAt(str.length()-1))=='y' || Character.toLowerCase(str.charAt(str.length()-1))=='z') {
				counter++;
			}
		
		return counter;	
	}
	
	
	public static String withoutString(String base, String remove) {
	
		int baselength = base.length();
		int removelength = remove.length();
		int current = 0;
		
		
		StringBuilder stbuilder = new StringBuilder(baselength);
		
		String baselow = base.toLowerCase();
		String removelow = remove.toLowerCase();
		
		int place;
		place = baselow.indexOf(removelow);
		
		while(place != -1)
		{
			for(; current < place; current++) {
				stbuilder.append(base.charAt(current));
			}
			current = place+removelength;
			place = baselow.indexOf(removelow, current);
		}
		for(; current < baselength; current++)
		{
			stbuilder.append(base.charAt(current));
		}
		return stbuilder.toString();
		
//		StringBuilder str = new StringBuilder(base);
//		
//		int removeLength = remove.length();
//		int place =remove.length();
//		
//		for(int i=0; i<str.length()-2; i++) {
//			if(str.substring(i,i+place).equals(remove)) {
//				str.delete(i, i+3);
//			}
//		
//		}
//		
//		return str.toString();
	}
	
	public static int countYz(String str) {
		
		int count=0;
		
		for(int i=0; i<str.length();i++) {
			if(!Character.isLetter(str.charAt(i))) {
				if(str.charAt(i-1)=='z' || str.charAt(i-1)=='y') {
					count++;
				}
			}
		}
		if(str.charAt(str.length()-1)=='z' || str.charAt(str.length()-1)=='y' ) {
			count++;
		}
		return count;
	}
	
	public static String houtString(String base, String remove) {
		
		StringBuilder str = new StringBuilder(base);
		for(int i=0; i<str.length(); i++) {
			if(str.substring(i,i+remove.length()).equalsIgnoreCase(remove)) {
				str.delete(i, i+remove.length());
			}
		}	
		return str.toString();
		
	}
	
	public boolean equalIsNot(String str) {
		  
		StringBuilder base = new StringBuilder(str);
		int count=0;
		int count1=0;
		
		for(int i=0; i<base.length()-1; i++) {
			if(str.substring(i,i+2).equals("is")) {
				count++;
			}
		}
		
		for(int i=0; i<base.length()-2; i++) {
			if(str.substring(i,i+3).equals("not")) {
				count1++;
			}
		}
		  
		  return count==count1;
		}
	
	public boolean gHappy(String str) {
		
		if(str.length()==0) {
			return true;
		}
		
		int count=0;
		int count2=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='g' && str.charAt(i+1)=='g') {
				count+=2;
			}
		}
	
		return count%2==0;
	}
	
	public int sumDigits(String str) {
		  
		  int sum = 0;
		  
		  for(int i=0; i<str.length(); i++){
		    if(Character.isDigit(str.charAt(i))){
		      sum += Integer.parseInt(String.valueOf(str.charAt(i))); 
		    }
		  }
		  return sum;
		}
	
     
	public String sameEnds(String string) {
		  
		
		
		
		
		return null;
	}
	
	
	
	

	public static void main(String[] args) {
		
	    System.out.println(withoutString("Hello Therello","llo"));
		
		String base="Hello Thlloere";
		String remove="llo";
		
		int place = base.indexOf(remove);
		System.out.println(place);

//		StringBuilder str = new StringBuilder(base);
		
		System.out.println("===============");
		
		System.out.println(houtString("Hello therello", "llo"));
		
		String x = "Hello";
		System.out.println(x.substring(4,5));
		
		
	}
}