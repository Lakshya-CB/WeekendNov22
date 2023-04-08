package Lec_31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMap_demo {
	public static void main(String[] args) {
//		HashMap<Key,Value>
		HashMap<String, Integer> HM = new HashMap<>();
		HM.put("A", 10);// O(1)
		HM.put("Ba", 20);
		HM.put("CB", 10);
		HM.put("Ezz", 11);
		HM.put("Fa", null);
		System.out.println(HM);
		System.out.println(HM.get("Faf"));// O(1)
		System.out.println(HM.containsKey("Faf"));
		
		HM.remove("C"); // O(1)
		HM.put("Ezz", 10009);
		
		System.out.println(HM);
//		HashMap ka traversal
		System.out.println("=====================");
//		System.out.println(HM.keySet());
//		System.out.println(HM.values());
//		Set<String> keys = HM.keySet();
//		System.out.println(keys);
//		ArrayList<String> AL = new ArrayList<>(keys);
//		System.out.println(AL);

		for(String key : HM.keySet()) {
			System.out.println(key+"=>"+HM.get(key));
		}
		
	}
}
