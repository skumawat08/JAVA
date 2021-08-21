package linkedLists;

public class MyLinkedList<E> {
	    Node<E> head;
		public void add(E data)
		{
			Node<E> toAdd = new Node<E>(data);
			if(isEmpty())
			{
				head = toAdd;
				return;
			}
			Node<E> temp = head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=toAdd;
		}
		
		public E removeLast() throws Exception
		{
			Node<E> temp = head;
			
			if(temp==null)
			{
				throw new Exception("cannot remove last element from empty likned list");
			}
			if(temp.next==null) {
				Node<E> toRemove = head;
				head = null;
				return toRemove.data;
			}
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			Node<E> toRemove = temp.next;
			temp.next = null;
			return toRemove.data;
		}
		public E getLast() throws Exception{
			Node<E> temp = head;
			
			if(temp==null) {
				throw new Exception("cannot peek last element from empty liked list");
			}
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			return temp.data;
		}
		void display()
		{
			Node<E> temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data+"-->");
				temp=temp.next;
				
			}
			System.out.print("null");
		}
		public boolean isEmpty() {
			return head==null;
		}
		public static class Node<E>{
			public E data;
			public Node<E> next;
			
			public Node(E data)
			{
				this.data= data;
				next = null;
			}
		}
}
