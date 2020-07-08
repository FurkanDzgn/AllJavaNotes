package Day37_Map.Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Camel extends Object {
	
	/*
	 * Create one class Camel Class with name, age, location create getters and setters.
	 * Create another class called CamelClass with main method 
	 * Create new object and store with camelId inside the map with camel object
	 * CamelIds has different format like "1P32M" , "2PMA4"
	 * store 5 camel to your map
	 * key will be String and Value will be camel object 
	 */
	
	private String name;
	private int age;
	private String location;
	
	public String getName() {
		return this.name;
	}           // method signature
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Camel(String name, int age, String location) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	// Create method takes one parameter as HashMap<String, CAmel>
	// this method returns Sets of camel names.
	public static HashSet<String> getNames(HashMap<String,Camel> camels){
		
		HashSet<String> camNames = new HashSet();
		Set<String> keys = camels.keySet();
		
		for(String key:keys) {
			camNames.add(camels.get(key).getName());
		}
		return camNames;
	}
	
	// Create one method takes one parameter as HashMap<String, Camel>
	// this method return Sets of camel object.
	
	public static HashSet<Camel> method2(HashMap<String, Camel> met) {
		
		HashSet<Camel> camNames = new HashSet();
		Set<String> keys = met.keySet();
		for(String key:keys) {
			camNames.add(met.get(key));
		}
		
		return camNames;
		
		
	}
	
	
	@Override
	public String toString() {
		return "Camel [name=" + name + ", age=" + age + ", location=" + location + "]";
	}
	

}
