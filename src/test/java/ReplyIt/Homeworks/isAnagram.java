package ReplyIt.Homeworks;

public class isAnagram {
	 public boolean isAnagram(String s, String t) {
		 
		
		 String a="";
	  OUTHERLOOP:
		for(int i=0; i<s.length(); i++) {
		INNERLOOP:
			for(int x=0; x<t.length(); x++) {
				 if(s.charAt(i)==t.charAt(x) && s.length()==t.length() ) {
					 a+=t.charAt(x);
					 continue OUTHERLOOP;
				 } 
			 }
		 }  if(s.equals(a)) {
			 //System.out.println(a);
			 return true;
		 }
		   else {
		//	   System.out.println(a);  
	     return false;
		   }
	 }
	 public static void main(String[] args) {
		 isAnagram iAnG = new isAnagram();
		 
		 System.out.println(iAnG.isAnagram("techtoriall","lairoohcet"));
		 
		 
		 
		 
	}
	

}
