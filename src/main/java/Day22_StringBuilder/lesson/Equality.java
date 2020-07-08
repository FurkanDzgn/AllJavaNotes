package Day22_StringBuilder.lesson;

public class Equality {
	public static void main(String[] args) {
		
		
		StringBuilder cor=new StringBuilder("Corolla");
		StringBuilder cor1=new StringBuilder("Corolla");

		StringBuilder cor2=cor.append(" 2020");

		System.out.println((cor==cor1));  //--> they are not pointing to same object in the memory, it will print false.
        System.out.println(cor.equals(cor1));
		
		System.out.println((cor==cor2));// --> it will return true because cor and cor2 is pointing to same object.
		
		StringBuilder year=new StringBuilder("2050");
		StringBuilder year1=new StringBuilder("2050");
		
		System.out.println(year.equals(year1)); // --> it will return false
		System.out.println(year==year1); // --> it will print false
		
		StringBuilder year2=year;
		
		System.out.println(year.equals(year2));//true
		System.out.println(year==year2);//true
		
		String str="Techtorial";// inside Stringpool
		String str1=new String("Techtorial");//inside heap outside Stringpool
		
		System.out.println(str.equals(str1)); // the values are same that's why result will be true
		System.out.println(str==str1);// false

	}

}
