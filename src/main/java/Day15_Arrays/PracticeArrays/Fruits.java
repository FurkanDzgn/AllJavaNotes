package Day15_Arrays.PracticeArrays;

public class Fruits {
	public static void main(String[] args) {
		
		String[] fruits1 = {"Banana", "Apple", "Orange", "Carrot"};
		String[] fruits2 = {"Kiwi", "Grapes", "Apple", "Mango", "Orange", "Banana"};
		
		for(int a=0; a<fruits1.length; a++) {
			for(int b=0; b<fruits2.length; b++) {// banana, apple, orange
				if(fruits1[a].equals(fruits2[b])) {// banana (kiwi,grapes,apple,mango,orange)
					System.out.println(fruits1[a]+" is in Fruits2 box.");
					
				}
			}
		}
	
		
		
		
		
	}
}
