package Overloading_Overriding;

class A
{
	public void f1(int x)
	{
		System.out.println("class A");
	}
}
class B extends A
{
	public void f1(int x,int y)
	{
		System.out.println("class B");
	}
}
public class Example1
{
	public static void main(String[] args)
	{
		B obj=new B();
		obj.f1(2);
		obj.f1(4,7);
	}
}