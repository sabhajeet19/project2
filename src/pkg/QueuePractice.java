package pkg;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Lucknow");
		queue.add("India");
		queue.add("Mumbai");
		queue.add("UttarPradesh");
		System.out.println(queue);
		queue.remove("Lucknow");
		System.out.println("after remove "+queue);
		System.out.println(queue.peek());
		queue.remove();
		System.out.println(queue);
	    String top = queue.poll();
	    System.out.println(top);
	    System.out.println(queue);
		
	}

}
