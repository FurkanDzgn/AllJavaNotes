package Day28_ArrayList.WarmUp;

import java.util.ArrayList;

public class BasicArraylist {
	public static void main(String[] args) {
		
		ArrayList bankCards = new ArrayList();
		
		// [] -> [0] ="Visa";
		
		bankCards.add("Visa");
		bankCards.add("MasterCard");
		bankCards.add("Amex");
		// array.lenght
		System.out.println(bankCards.size());
		// object -> String, Integer, Double, Boolean
		bankCards.add(101); // int -> Integer ===> Autoboxing
		bankCards.add(2.5); // double -> Double ===> autoboxing
		bankCards.add(true);
		
		System.out.println(bankCards.get(2));
		
		System.out.println(bankCards);
		
		// array[2] = "CapitalOne";
		bankCards.set(2,"CapitalOne");
		System.out.println(bankCards);
		               // Integer
		bankCards.set(bankCards.indexOf("MasterCard"), "Chase");
		System.out.println(bankCards.get(1));
		
		//Arrays.toString(array);
		
		System.out.println(bankCards);
		
		bankCards.add("Discover, BofA");
		System.out.println(bankCards);
		System.out.println(bankCards.size());
		
		for(int i=0; i< bankCards.size(); i++) {
			System.out.println(bankCards.get(i));
		}
		
		System.out.println("-----------------");
		
		// Object is parent class of classes.
		for(Object card:bankCards) {
			System.out.println(card);
		}
		
		
		}

}
