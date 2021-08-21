package staticKeyword;

public class StaticBlock {
	
	static {
		System.out.println("block1");
	}
	
	static {
	System.out.println("block2");
	}
	
	
	public static void main(String[] args) {

		System.out.println("main");
	}

	static {
		System.out.println("block3");
	}
}
