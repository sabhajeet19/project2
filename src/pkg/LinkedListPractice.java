package pkg;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(12);
		linkedList.add(22);
		linkedList.addFirst(33);
		linkedList.addLast(44);
		System.out.println(linkedList);
		linkedList.add(2, 66);
		System.out.println(linkedList);
		for(Integer al : linkedList) {
			System.out.print(al+" ");
			
		}
		System.out.println();
		linkedList.remove(2);
		linkedList.removeLast();
		System.out.println(linkedList);
		

	}

}
