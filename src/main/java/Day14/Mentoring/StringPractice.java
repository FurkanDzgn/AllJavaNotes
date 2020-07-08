package Day14.Mentoring;

public class StringPractice {
	
	public static void main(String[] args) {
		
		//TODO Auto-generated method stub
		String str = "Techtorial Academy 2020";
		System.out.println(str.contains(" "));
		System.out.println(str.startsWith("Techtorial"));
		String concatM=str.concat(" the best school.");
		System.out.println(concatM);
	    String subSTR=concatM.substring(0,23);
	    System.out.println(subSTR);
	    
	    for(int i=0; i<str.length(); i++) {
	    
	    	if(( str.charAt(i)<='z' && str.charAt(i)>='a' || str.charAt(i)<='Z' && str.charAt(i)>='A')){
	    		System.out.print(str.charAt(i));
//	       
////	        if(!(( str.charAt(i)<='z' && str.charAt(i)>='a' || str.charAt(i)<='Z' && str.charAt(i)>='A'))){
////		    		System.out.print(str.charAt(i));
//	    			
	    	}
	    	
	    	for(char c='a'; c<='z'; c++) {
	    		if(str.charAt(i)==c) {
	    			System.out.print(str.charAt(i));
	    		}	
	    	}
	    	
	   
	    	
	    	for(char c='0'; c<='9'; c++) {
	    		if(str.charAt(i)==c) {
	    			System.out.print(str.charAt(i));
	    }
	  }
	}
  }
}
