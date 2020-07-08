package Day38_Map.MapPractice;

import java.util.Hashtable;

public class HashTablePrac {
	public static void main(String[] args) {
		
		Hashtable<Integer,Boolean> table = new Hashtable();
	    	
		table.put(1, true);
		table.put(2, false);
		table.put(3, true);
		table.put(33,false);
		table.put(6, false);
	//	table.put(3, null); // throws exception
	//	table.put(null, false); // throws exception
				
		System.out.println(table);
		
		table.isEmpty();
		table.put(33, true);
		System.out.println(table);
		Hashtable<Boolean,Integer> xx = new Hashtable();
		
		xx.put(true, 1);
		xx.put(false, 2);
	//	xx.put(null, 3);   throws exception
	//	xx.put(true, null);  throws exception
		System.out.println(xx); 
	}

}
