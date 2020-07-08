package Day29.Practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeRemove {
	public static void main(String[] args) {
		
		List<Character> list = new ArrayList<>();
		
		list.add('q');
		list.add('w');
		list.add('x');
		list.add('y');
		list.add('q');
		
		if(list.remove(new Character('q'))) { // remove first q  --> true || q w x y -> w x y    //  if(list.remove(Character.valueOf('q')))
			if(list.remove(new Character('q'))) { // remove second q --> false || w x y -> w x y 
				list.remove(new Character('x')); // w y
			}else {
				list.remove(new Character('y')); // w x y -> w x 
			}
		}
		
		System.out.println(list);
		
	}
	
	

}
