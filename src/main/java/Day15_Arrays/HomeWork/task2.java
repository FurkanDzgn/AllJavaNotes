package Day15_Arrays.HomeWork;

public class task2 {
	 public boolean isPowerOfThree(int n) {
	      
	  if(n<=27 && n%3==0)
		  return true;
	  else
		  return false;
	    
	     
  }
	 public static void main(String[] args) {
		task2 pOt=new task2();
		
		System.out.println(pOt.isPowerOfThree(45));
	}
}


