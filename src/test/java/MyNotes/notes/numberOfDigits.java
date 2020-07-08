package MyNotes.notes;

public class numberOfDigits {
	 public static void main(String[] args){
	
		 
		    int x=123;
		    int y=x;
		    int a=0;
		    for(; y!=0;){
		      y=y/10;
		      a++;
		    }

		    System.out.println(a);
		    
		    
		    int reverse=0;
		    for(int z=0; z<a; z++){
		    	reverse=reverse*10;
		    	reverse=reverse+x%10;
		      x=x/10;
		    }
		    
		    
		    System.out.println(reverse);
		
		 
			 
		    
  
		  }

}
