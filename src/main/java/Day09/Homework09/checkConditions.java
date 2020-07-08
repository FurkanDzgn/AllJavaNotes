package Day09.Homework09;

import java.util.Scanner;

public class checkConditions {
	public boolean checkConditionS(String item ,String item1,String item2,String item3) {
	
		boolean x=item.startsWith(item1);
		boolean y=item.contains(item2);
		boolean z=item.endsWith(item3); 
			
		if (x==true && y==true && z==true) {
	    //	boolean a =true;
//			System.out.println("checkConditions "+item+","+item1+","+item2+","+item3+"->"+"true");
			return true;
		}
		else {
			
//			System.out.println("checkConditions "+item+","+item1+","+item2+","+item3+"->"+"false");			
			return false;
		}
		
			
	}	
	public static void main(String[] args) {
		checkConditions cCo=new checkConditions();
		Scanner scan=new Scanner(System.in);
		
		String item=scan.nextLine();
		String item1=scan.next();
		String item2=scan.next();
		String item3=scan.next();
		
		boolean result = cCo.checkConditionS(item, item1, item2, item3);
		System.out.println(result);
		
	//	cCo.checkConditionS("Furkan duz gun fb", "Furkan", "duz", "fb");
		
		
	}
}
