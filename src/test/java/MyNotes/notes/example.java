package MyNotes.notes;

public class example {
	
	public static boolean in(int n,int power){
	    
		boolean value;


	        while(true){

	            if(n>=power){
	                if(n%power==0){
	                    n=n/power;
	                    if(n==1) {
	                        value=true;
	                        break;
	                    }
	                }
	                else{
	                    System.out.println(n);
	                    value=false;
	                    break;

	                }

	            }
	            else{
	                value=false;
	                break;
	            }
	        }


	    return value;
	    }
	 public boolean isPowerOfThree(int n) {
	      
	     if(n%3==0 && n%2!=0 && n%5!=0 && n%7!=0)
			  return true;
			 
		  else
			  return false;
		    
		     
	  }
		 public static void main(String[] args) {
			 example pOt=new example();
			
			System.out.println(pOt.isPowerOfThree(81*81));
	}
	
	
		
	}


