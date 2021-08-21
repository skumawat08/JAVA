package ExceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
//		try {
//			int a = 4;
//			int b = 0;
//			int c = a/b;
//			
//			System.out.println(c);
//		}
//		catch (ArithmeticException e)
//		{
//			System.out.println(e.getMessage()+" occured, please check your code");
//		}
//		
//		finally {
//			System.out.println("sorry for inconvenience");
//		}
//		
		
//		System.out.println("important code, run it");
		
			fun1();
	}
	
			static void fun1() {
					
					int a = 4;
					int b = 3;
					int c = a/b;
					System.out.println(c);
					
					boolean isDanger = true;
					if(isDanger)
					{
						throw new ArrayIndexOutOfBoundsException();
						//throw new ArrayIndexOutOfBoundsException("danger was coming");
					}
			}
}
