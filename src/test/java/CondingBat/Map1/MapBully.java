package CondingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class MapBully {
	
	public Map<String, String> mapBully(Map<String, String> map) {
		
		    if(map.containsKey("a")) {
		    	map.put("b", map.get("a"));
		    	map.replace("a", "");
		    	
		    }
		    return map;
	}
	
	public static Map<String, String> mapAB2(Map<String, String> map) {
		  
		  if(map.get("a") == map.get("b") ){
		    map.remove("a");
		    map.remove("b");
		  }
		  return map;
		}
	public Map<String, String> mapAB4(Map<String, String> map) {
		  
		  if(map.get("a").length() > map.get("b").length()) {
			  map.put("c", map.get("a"));
		  }else if(map.get("b").length() > map.get("a").length()) {
			  map.put("c", map.get("b"));
		  }
		  return map;
		  
		}
	public static void main(String[] args) {
		Map<String,String> map = new HashMap();
		map.put("a", "aaa");
		map.put("b", "aaa");
		map.put("c","ccc");
		System.out.println(mapAB2(map));
	}

}
