package Day29.Practice;

import java.util.List;
import java.util.ArrayList;

public class ListMethods {
	public static void main(String[] args) {
		
		List<Character> chars = new ArrayList<>();
	
		chars.add('a'); // 0
		chars.add('b'); // 1
		chars.add('d'); // 2
		System.out.println(chars);
		// char array [] = {'a', 'b', 'd'} -> create new array, 
		
		chars.add(2, 'c');
	//	chars.set(2, 'c'); // remove 'd'
		
		System.out.println(chars);
		
		System.out.println(chars.add('e')); // return type is boolean
		
		System.out.println(chars);
		
		List<Character> chars2 = new ArrayList<>();
		
		chars2 = chars.subList(chars.indexOf('c'),chars.size());
		System.out.println(chars2);
		System.out.println(chars);
		
//		chars.remove('d'); // 'd' -> is taken as int value -> 100
//		System.out.println(chars+"-----");
	//	chars.remove(chars.indexOf('d'));// -> it will work
	//	System.out.println(chars);
	//	chars2.remove(1);

		chars2.remove(new Character('d'));	
		
		System.out.println(chars2);
		
		System.out.println(chars2.remove(new Character('d'))); // return type is boolean
		
		System.out.println(chars2.remove(new Character('d')) +" "+chars2.remove(new Character('w')));
		
		System.out.println("=========================");
		
		System.out.println(chars);
		System.out.println(chars2);
		
		chars.removeAll(chars2);
		
		System.out.println(chars);
		
	}

}
