package methods;

public class passByValue {
	// java is always pass by value
//				public static void main(String[] args)
//				{
//					int a=3;
//					int b=4;
//					int result=swap(a,b);
//					System.out.println(result);
//					System.out.println(a+" "+b);
//				}
//				static int swap(int c,int d)
//				
//				{
//					int temp =c;
//					c=d;
//					d=temp;
//					
//					return c;
//				}
//}
		public static void main(String[] args)
		{
//			Dog c = new Dog();
//			c.legs=4;
//			Dog d = new Dog();
//			d.legs=3;
//			swap(c,d);
//			System.out.println(c.legs+"  "+d.legs);
			Dog a = new Dog();
			a.legs=4;
			changeDog(a);
			System.out.println(a.legs);
		}
		static void swap(Dog a,Dog b)
		{
			Dog temp=a;
			a=b;
			b=temp;
			
		}
		static void changeDog(Dog dog)
		{
			dog.legs=6;
		}
}
//in the case of non-primitive data types
class Dog
{
	int legs;
	
}