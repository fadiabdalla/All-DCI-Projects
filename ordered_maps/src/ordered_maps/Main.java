package ordered_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		
		LinkedHashMap<Integer, String> months1 = new LinkedHashMap<>();
		
		months1.put(2, "Feb");
		months1.put(11, "Nov");
		months1.put(9, "Sep");
		
		for (Map.Entry<Integer, String> map1 : months1.entrySet()) {
			
			
			System.out.println(map1.getKey() + ", " + map1.getValue());
			
		}
		
		
		System.out.println();
		
		
		TreeMap<Integer, String> months2 = new TreeMap<>();
		months2.put(11,"Nov");
		months2.put(2,"Feb");
		months2.put(9,"Sep");
		
		for(Map.Entry<Integer, String> map2 : months2.entrySet()) {
		System.out.println(map2.getKey() + ", " + map2.getValue());
		}
	}

}
