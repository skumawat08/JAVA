package methods;

public class Introduction {
	
	public static void main(String[] args)
	{
		int firstNumber=33;
		int secondNumber=34;
		//int result = maxOf(firstNumber,secondNumber);
		int result = maxOf(100,20);
		
			System.out.println(result);
			
			sayHi();
	}
	
	static int maxOf(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	static void sayHi()
	{
		System.out.println("Hi");
		System.out.println("good morning");
	}
}
