package methods;
//function overloading:
//						when 2 or more fuctions with same name but different signature are called in a class 					   
public class Overloading {
	public static void main(String[] args)
	{
		int firstInt=24;
		int secondInt=16;
		float f=2.5f;
		int result1= maxOf(firstInt,secondInt);
		
		System.out.println(result1);
		
		float result2= maxOf(f);
		System.out.println(result2);
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
	
	static float maxOf(float c)    //same function with different signature
	{
		return c;
	}
}
