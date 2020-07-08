package Day31_ReadFiles.ReadFiles;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExampe {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		LinkedList<Integer> linkedList = new LinkedList<>();
	//	LinkedList<Integer> recap = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(15);
		System.out.println(linkedList);
		linkedList.addFirst(5);
    	System.out.println(linkedList);
		linkedList.addLast(25);
		System.out.println(linkedList);
		
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.getFirst()); // if LinkedList is empty give us thrown exception
		
		System.out.println(linkedList.peekFirst()+"*"); // if LinkedList is empty return us null
		System.out.println(linkedList.poll()+"--"); // gets the value and removes it. Automayically removes first element
		System.out.println(linkedList);
		
		System.out.println(linkedList.pop()); // gets the value and removes it.
		System.out.println(linkedList);
		
		// Collections
		// Date
		// Enums
	
	}

}
