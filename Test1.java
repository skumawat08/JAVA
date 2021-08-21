//static initialization block

public class Test1
{
	private static int x;
	static
	{
		System.out.println("Initializer:"+x);
		x=5;
	}
	
	public Test1()
	{
		System.out.println("constructor:"+x);
	}
	
	public static void main(String[] args)
	{
		Test1 t1=new Test1();
		
	}
}