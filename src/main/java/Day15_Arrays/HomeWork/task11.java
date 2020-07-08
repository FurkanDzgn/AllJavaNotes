package Day15_Arrays.HomeWork;

public class task11 {
	public int reverse(int x){
	    int y=x;
	    int a=0;
	    for(int i=0 ; y!=0; ++i){
	      y=y/10;
	      a++;
	    }

	    int sum=0;
	    for(int z=0; z<a; z++){
	      sum=sum*10;
	      sum=sum+x%10;
	      x=x/10;
	    }
	    
	    return sum;
	  }
	  public static void main(String[] args){
	    task11 str = new task11();
	    
	   
	    System.out.println( str.reverse(123));
	    
	  }
	  
	}
	


