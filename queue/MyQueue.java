package queue;

import linkedLists.MyLinkedList.Node;

public class MyQueue<E> {
	
	private Node<E> head, rear;
		
		public void enqueue(E e) {
			Node<E> toAdd = new Node<>(e);
			if(head==null) {
				head=rear=toAdd;
			}
			rear.next = toAdd;
			rear = rear.next;
		}
		
		public E dequeue() {
			if(head==null) {
				return null;
			}
			Node<E> temp = head;
			head = head.next;
			if(head==null)
			{
				rear=null;
			}
			return temp.data;
		}
		public E peek() {
			Node<E> temp = head;
			return temp.data;
		}
}
