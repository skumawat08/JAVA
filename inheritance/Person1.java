package inheritance;

public class Person1 {
	
		protected String name;
		
		public Person1(String name)
		{
			this.name=name;
			System.out.println("inside the person1 constructor");
		}
		
		public void eat()
		{
			System.out.println("Person1"+name+" is eating");
		}

}
