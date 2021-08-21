package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		
		Pet p =d;
		Animal a = d;
		p.walk();  //p.walk() will call the walk() function of Dog class and this is called run time polymorphism
		/*the run time polymorphism is , at the compile time compiler don't tell that the object of class call 
		 * the function of which class 
		 * which function called , we know it at run time
		 */
		
		d.walk();
		
		//variable never override
		System.out.println(d.name);
		System.out.println(p.name);
		
		greetings();  /*no-argument greeting() function is calling 
		              this is compile time polymorphism because we already know the which function is calling
                       */
	}
    	
	public static void greetings()
	{
		System.out.println("hey, there!");
	}
	
	public static void greetings(String s)
	{
		System.out.println(s);
	}
}
