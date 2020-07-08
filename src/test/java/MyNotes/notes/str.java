package MyNotes.notes;

import java.util.Scanner;

public class str {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number:");
		
		String x=scan.nextLine();
		
		System.out.println("length: "+x.length());
		
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		System.out.println(x.indexOf('.'));
		System.out.println(x.charAt(9));
		System.out.println(x.substring(8));
		
		int a=x.indexOf('.');
		int b=x.indexOf('.',a+1);
		System.out.println(x.substring(0,a));
		System.out.println(x.substring(a+1));
		System.out.println(x.substring(a+1,b));
		System.out.println(x.substring(b));
		
		System.out.println(x.repeat(2));
	    String y="Chicago is better NewYork";
		System.out.println(y.replace("Chicago","NewYork"));
		System.out.println(x.trim());
		System.out.println(x.substring(a).concat("Las Vegas"));
      	int q=y.indexOf(' ');
		int w=y.indexOf(' ',q+1);
		int e=y.indexOf(' ',w+1);
     	int r=y.indexOf(e+1);
		System.out.println((y.substring(e)+y.substring(w,e)+y.substring(q,w+1)+y.substring(0,q)).trim());
			
		System.out.println(y.substring(0,q));
		
		
	}
}


