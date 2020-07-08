package Day37_Map.Practice;

import java.util.HashMap;
import java.util.Map;

public class CamelClass extends Object {
	
	public static void main(String[] args) {
		
		// Object --> mother of others object classes	
		HashMap<String,Camel> camels = new HashMap();
		
		Camel cam  = new Camel("Patel", 22, "Chicago");
		Camel cam2 = new Camel("Kumar", 29, "Los Angeles");
		Camel cam3 = new Camel("Alex", 44, "New York");
		Camel cam4 = new Camel("David", 14, "Miami");
		Camel cam5 = new Camel("Zach", 35, "New Jersey");
				
		camels.put("1P32M", cam);
		camels.put("1P33M", cam2);
		camels.put("1P34M", cam3);
		camels.put("1P35M", cam4);
		camels.put("1P36M", cam5);
		camels.put("1P37M", new Camel("Prences", 10, "Mexico"));
	
		System.out.println(camels);
		
		System.out.println(Camel.getNames(camels));
		
		System.out.println(Camel.method2(camels));
		
		
		
	}

}
