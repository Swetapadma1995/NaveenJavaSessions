package CollectionsTopics;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer,String> userMap = new HashMap<Integer,String>();
		
		userMap.put(1, "Sweta");
		userMap.put(2, "Sangita");
		userMap.put(3, "Kunmun");
		userMap.put(4, "Papu");
		
		HashMap<String,String> empMap = new HashMap<String,String>();
		empMap.put("Ravi", "QA");
		empMap.put("Rahul", "DEV");
		empMap.put("Rudra", "MANAGER");
		empMap.put("Raju", null);
		empMap.put("Ravi", null);
		empMap.put(null, "PR");
		empMap.put(null, null);
		empMap.put("Rahul", "QA345S");
		
		
		
		
		System.out.println(userMap.get(1));
		System.out.println(userMap.get(5)); //null
		
		System.out.println(empMap.get("Rahul"));
		System.out.println(empMap.get("Sila"));
		
		System.out.println(empMap);
		
	}

}
