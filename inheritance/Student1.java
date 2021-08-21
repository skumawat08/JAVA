package inheritance;

public class Student1 extends Person1{

		public Student1(String name) {
		super(name);
		System.out.println("inside the student1 constructor");
	}

		public void eat()
		{
			super.eat();
			System.out.println("Student1"+name+" is eating");
		}
}
