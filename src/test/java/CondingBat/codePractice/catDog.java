package CondingBat.codePractice;

public class catDog {
	public boolean catDog(String str) {
		  
		  boolean result=false;
		  
		outherloop:
			for(int i=0; i<str.length();i++){
		    if(str.substring(i,i+3).equals("cat")){
		    	
		    innerloop:
		    	for(int a=0; a<str.length()+1;a++){
		        if(str.substring(a,a+3).equals("dog")){
		          result=true;
		          break outherloop;
		        }
		      }
		      
		    }
		  } 
		  return result;
		}
	public static void main(String[] args) {
		catDog cD=new catDog();
		
		System.out.println(cD.catDog("catdogcat"));
		
		
	}
	
	
	
	
	

}
