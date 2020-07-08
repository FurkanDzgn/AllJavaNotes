package Day12_Loops.Loops;

import java.util.Scanner;

public class HomeworkCountNumbers {public static void main(String[] args) {
	
	// number -234 -> 4+3+2 = 9
	Scanner scan=new Scanner(System.in);
	
	int num=scan.nextInt();
	int num1=num;
	int count=0;
	int total=0;
	while(num1!=0) {
		
		num1/=10;
		++count;
	}
     System.out.println("Number of digits: "+count);
     
     
     while(count>0) {
    	int rem = num%10;
    	 num = num/10;
         total+= rem;
    	 count--;
     }
	System.out.println(total);
	
 }


}
