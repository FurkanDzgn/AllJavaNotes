package ReplyIt.Homeworks;

public class firstUniqChar {
	 public int firstUniqChar(String s) {
		 String resultTest = "";
		 char result=' ';
		 int x;
//		OUTHERLOOP: 
//		 for(int i=0; i<s.length(); i++) {		 
//		INNERLOOP:	 
//			 for( int b=0; b<s.length(); b++ ) {
//				 
//				 if(s.toLowerCase().charAt(i)==s.toLowerCase().charAt(b) && i!=b) {
//					 result=s.charAt(i);
//					 resultTest +=s.charAt(i);
//					 break OUTHERLOOP;		
//				 }	
//				
//			 }
//		
//		 }
		 if (!resultTest.isEmpty()) {
			 x=s.toLowerCase().indexOf(result);
		 	return x;
		 }
		 
		 
		s = s.toLowerCase();
		
		for(int i=0; i<s.length(); i++) {
			char letter = s.charAt(i);
			if (s.indexOf(letter) == s.lastIndexOf(letter))
				return i;
		}
		
		return -1;
			 
	 }
	 public static int firstChar(String s) {
		 
		 s=s.toLowerCase();
		 char [] letterS = s.toCharArray();
		 
		OUTHERLOOP: 
			for(int i=0;i<letterS.length; i++) {
		INNERLOOP:
			for(int a=0; a<letterS.length; a++) {
				if(letterS[i]==letterS[a] && i!=a) {
					return i;
				//	break OUTHERLOOP;
				}
			}
		 }
		 
		 return -1;
		 
		 
			 
	 }
	 
	 public static void main(String[] args) {
		 firstUniqChar xxx = new firstUniqChar();
		 
		 System.out.println(xxx.firstUniqChar("llsasii"));
		 System.out.println(firstChar("Techtorial"));
	
	}

}
