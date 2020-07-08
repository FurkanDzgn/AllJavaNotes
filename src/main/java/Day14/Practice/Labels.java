package Day14.Practice;

public class Labels {
	public static void main(String[] args) {
		
		//ABCDE
		//A12345
		//B12345
		//C123
		//D12345
		//E12345
		
		String letters="ABCDE";
		
	OUTERLOOP:
		for(int i=0; i<letters.length(); i++) { // OUTERLOOP
			System.out.print(letters.charAt(i));
			INNERLOOP:
               for(int a=1; a<=5; a++) { // INNERLOOP
            	  if (letters.charAt(i)=='C' && a==4) {
            		  System.out.println();
            		  break INNERLOOP;
            	  }
            	                       
            	   System.out.print(a);
               }
               System.out.println();
		}
	}

}
