package priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Kiwi");
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Banana");
		pq.add("Orange");
		
		System.out.println(pq);
		
		//System.out.println(pq.remove());
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
//		System.out.println(pq.remove());
		
		System.out.println(pq.peek()+" peek");
	}

}
