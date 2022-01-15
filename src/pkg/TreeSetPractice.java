package pkg;

import java.util.TreeSet;

public class TreeSetPractice {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(); 
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("D");
		treeSet.add("C");
		boolean r = treeSet.add("C");
		System.out.println(r);
		System.out.println(treeSet);
		System.out.println(treeSet.getClass());
		treeSet.remove("D");
		System.out.println(treeSet);
		
		
		

	}

}
