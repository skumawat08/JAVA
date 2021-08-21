package Overloading_Overriding;

class A //car
{
	public void f1(int x)
	{
		System.out.println("class A");
	}
}
class C extends A
{
	public void f1(int x)
	{
		System.out.println("class C");
	}
}
public class Example2 
{
	public static void main(String[] args)
	{
		C obj=new C();
		obj.f1(2);
	}
}
