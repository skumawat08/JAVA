package AarrayDeque;

public class MyDeque<E> {
		
			Node<E> head,tail;
	
	public void addToHead(E data) {
		Node<E> toAdd =new Node<>(data);
		if(head==null) {
			head=tail=toAdd;
			return;
		}
		head.next=toAdd;
		toAdd.prev=head;
		head=toAdd;
	}
	
	public E removeLast() {  //removeLast means remove the tail
		if(head==null) {
			tail=null;
			return null;
		}
		Node<E> toRemove = tail;
		if(tail.data==head.data) {
			head=null;
			return tail.data;
		}
		tail=tail.next;
		tail.prev=null;
		
		return toRemove.data;
	}
	
	public void display() {
		Node<E> current = tail;
		if(head==null) {
			tail=null;
		 System.out.print("empty deque");
		}
		else {
		System.out.print("[");
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println("]");
		}
	}
	 
		public static class Node<E>{
			E data;
			Node<E> next,prev;
			
			public Node(E data) {
				this.data=data;
				this.next=this.prev=null;
			}
		}
}
