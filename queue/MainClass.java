package queue;

//import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		//Queue<Integer> q = new LinkedList<>();
		
//		q.add(12);
//		q.add(34);
//		q.add(15);
		
//		System.out.println(q);
//		System.out.println(q.element());  //return the element the is about to remove
//		System.out.println(q.remove());
	//	System.out.println(q.poll());
	
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(34);
		mq.enqueue(41);
		mq.enqueue(11);
		
		System.out.println(mq.peek()+" -->peek ");
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		mq.enqueue(99);
		System.out.println(mq.dequeue());
	}

}
