package vectorAndStack;

//import java.util.Stack;

public class VectorAndStack {

	public static void main(String[] args) throws Exception {
		MyStack<Integer> stack = new MyStack<>();
			stack.push(12);
			stack.push(15);
			stack.push(35);
			
			int popped = stack.pop();
			System.out.println(popped+" popped");
			
			int peeked = stack.peek();
			System.out.println(peeked+" peek");
	}

}
