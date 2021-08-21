package finalKeywors;

public class MainClass {

	public static void main(String[] args) {
		
		//Student s = new Student();
		
		final Student s = new Student();
		Student s1 = new Student();
		
		//s=s1;     this will give error because we cannot assign a refrence of any other object to a final object
		   //but we can assign values to variable with the help of final object
		
		s.name="john";

		System.out.println(s.name);
	}

}
