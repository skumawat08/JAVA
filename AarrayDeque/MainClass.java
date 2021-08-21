package AarrayDeque;

//import java.util.ArrayDeque;

public class MainClass {
		public static void main(String[] args) {
			
//			ArrayDeque<Integer> ad = new ArrayDeque<>();
//			
//			ad.addFirst(12);
//			ad.addFirst(34);
//			
//			ad.pop();  //function of stack   LIFO  then 34 is popped
//			System.out.println(ad.peek());
//			ad.pop(); //12 is popped
//			System.out.println(ad.peek());
//			
//			//deque as a stack
//			
//			ad.push(46);
//			ad.push(47);
//			ad.push(48);
//			System.out.println(ad.pop());  //48 popped
//			System.out.println(ad.pop());  //47 popped
//			System.out.println(ad.pop());  //46 popped
//			System.out.println(ad.peek()); // null becasue stack is empty
			
			MyDeque<Integer> md = new MyDeque<>();
			
			md.addToHead(12);
			md.addToHead(34);
			md.addToHead(44);
			md.addToHead(95);
			md.addToHead(84);
			md.addToHead(56);
			
			md.display();
			
			System.out.println(md.removeLast()+" removed");
			System.out.println(md.removeLast()+" removed");
			System.out.println(md.removeLast()+" removed");
			System.out.println(md.removeLast()+" removed");
			
			md.display();
			
		}
}
