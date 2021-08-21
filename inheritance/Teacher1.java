package inheritance;

public class Teacher1 extends Person1 {
	
	public Teacher1(String name)
	{
		super(name);
		System.out.println("inside the teacher1 constructor");
	}
	
	public void eat()
	{
		super.eat();  //this function will run first
		System.out.println("Teacher1"+name+" is eating");
	}

}
