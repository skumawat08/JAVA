package pack2;

import pack1.Student;

public class Example
{
	public static void main(String[] agrs)
	{
		Student s1=new Student();
		s1.setRoll(100);
		s1.setName("saransh kumawat");
		System.out.println("roll no.="+s1.getRoll());
		System.out.println("name="+s1.getName());
	}
}