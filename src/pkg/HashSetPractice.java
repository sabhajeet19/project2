package pkg;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		boolean r1 = hashSet.add("A");
		System.out.println(r1);
		boolean r2 = hashSet.add("c");
		System.out.println(r2);
		hashSet.add("d");
		hashSet.add("e");
		System.out.println("hashSet contains A ? "+hashSet.contains("A"));
		
		System.out.println(hashSet);
		hashSet.remove("e");
		System.out.println(hashSet);
		for(String item : hashSet) {
			System.out.print(item+" ");
		}
		System.out.println();
		System.out.println(hashSet.getClass());
		// to get element at index
		String[] str = hashSet.toArray(new String[hashSet.size()]);
		System.out.println(str[3]);
		

	}

}
