package pkg;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

	public static void main(String[] args) {
		Map<String,Integer> hashMap = new HashMap<String,Integer>();
		hashMap.put("raj", 11000);
		hashMap.put("shyam", 20000);
		hashMap.put("ajay", 20900);
		hashMap.put("pawan", 32000);
		System.out.println("size of map is "+hashMap.size());
		System.out.println(hashMap);
		if(hashMap.containsKey("shyam")) {
			int a = hashMap.get("shyam");
			System.out.println("value of key \"shyam\" is : " +a);
		}
		for(String key : hashMap.keySet()) {
			System.out.println("key: "+key+",  "+"value: "+hashMap.get(key));
			
		}
		Map<Integer,String> treeMap = new TreeMap<>();
		treeMap.put(1,"A");
		treeMap.put(2,"C");
		treeMap.put(4, "D");
		treeMap.put(6, "S");
		treeMap.put(3, "Z");
		System.out.println(treeMap);

	}

}
