package Class;

class Cat
{
	boolean hasFur;
	String color,breed;
	int legs,eyes;
	
	public void walk()
	{
		System.out.println("cat is walking");
	}
	public void eat()
	{
		System.out.println("cat is eating");
	}
	public void description()
	{
		System.out.println("my cat has"+legs+" legs "+eyes+" eyes ");
	}
}
class Dog
{
	String name,breed;
	
	public void jump()
	{
		System.out.println("my dog "+name+" is jumping");
	}
	public void description()
	{
		System.out.println("mt dog's breed is "+breed+" and name is "+name);
	}
}
public class Class1 {
	
		public static void main(String[] args)
		{
//			Cat cat1 = new Cat();
//			Cat cat2 = new Cat();
//			cat1.walk();
//			cat1.legs=4;
//			cat1.eyes=2;
//			cat1.description();
//			
//			cat2.eat();
//			cat2.legs=4;
//			cat2.eyes=1;
//			cat2.description();
			Dog dog1 = new Dog();
			Dog dog2 = new Dog();
			dog1.name="john";
			dog1.breed="germen";
			dog1.description();
			dog2.name="peter";
			dog2.breed="husky";
			dog2.description();
			
		}
}
