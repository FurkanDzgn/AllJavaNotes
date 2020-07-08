package Day42.Book;

import java.util.Collection;

public class Test {
	public static void main(String[] args) {
		// reference type           object
		AudioBook audioBook = new AudioBook();
	
		Book book = new AudioBook();
		 // ListenAble b = book;
		//  Object
		
		Object book2 = new AudioBook(); // Object class is indirectly super class for AudioBook
		//Book boo = book2;
		
		Object obj = new String();
		
		// right side decides what to implement
		
		//------------------
		
		AudioBook audioBook2 = new AudioBook();
		Book book1 = audioBook2;
		Readable book3 = audioBook2;
		ListenAble book4 = audioBook2;
		Object book5 = audioBook2;
	//	String book6 = audioBook2; // Stirng subClass of Object class 
		
		System.out.println(audioBook2 instanceof Object);
		System.out.println(audioBook2 instanceof Book);
		System.out.println(audioBook2 instanceof Readable);
		System.out.println(audioBook2 instanceof ListenAble);
		System.out.println(audioBook2 instanceof Collection); // false
   // 	System.out.println(audioBook2 instanceof String);
		
		// ** refenrence types need to be bigger than object class ** 
		
		// methods and variables come from the reference side, implementation comes from the right side
		// parent  class= child class ();
	}

}
