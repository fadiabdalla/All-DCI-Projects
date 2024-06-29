package hashmap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		//        Key     Value
		
		HashMap<Integer, String>  employeeIDs = new HashMap<>();
		
		employeeIDs.put(6893, "John");
		employeeIDs.put(1234, "Susan");
		employeeIDs.put(5678, "Joe");
		employeeIDs.put(9876, "Bob");
		
		
		System.out.println(employeeIDs);
		
		System.out.println(employeeIDs.get(5678));
		
		System.out.println(employeeIDs.containsKey(5678));
		System.out.println(employeeIDs.containsValue("John"));
		
		employeeIDs.put(9876, "George");
		
		employeeIDs.replace(6893, "Stella");
		System.out.println(employeeIDs);
		
		employeeIDs.putIfAbsent(1236, "Fadi");
		System.out.println(employeeIDs);
		
		employeeIDs.remove(1236);
		System.out.println(employeeIDs);

		
		for(Map.Entry<Integer, String> map: employeeIDs.entrySet()) {
			
			System.out.println(map.getKey() + ", " + map.getValue());
			
			
		}
		
	}

}
