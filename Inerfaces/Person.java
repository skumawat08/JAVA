package Inerfaces;

public class Person implements Student, Youtuber {

	public static void main(String[] args) {
	
		Person p = new Person();
		p.study();
		p.makevideos();
	}

	@Override
	public void study()
	{
		System.out.println("student is studying");
	}

	@Override
     public void makevideos()
     {
		System.out.println("youtuber is making videos");
     }

	@Override
	public void editVideo() {
		// TODO Auto-generated method stub
		
	}
	
}
