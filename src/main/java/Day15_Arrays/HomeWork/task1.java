package Day15_Arrays.HomeWork;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		  int x=scan.nextInt();
		  int q=x;
		  int b=0;
		  for(int i=0 ; q!=0; ++i){
		      q=q/10;
		      b++;
		    }
		   System.out.println(b);
           
		   
		   int reverseNum=0;
		    for(int y=0; y<3; y++){
		   
	          reverseNum = reverseNum * 10;
		      reverseNum=reverseNum+x%10;
		      x=x/10;
		    }
		    System.out.println(reverseNum);
	}

}
