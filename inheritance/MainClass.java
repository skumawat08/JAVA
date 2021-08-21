package inheritance;

public class MainClass {

	public static void main(String[] args) {
		
//		Teacher t = new Teacher();
//		t.name="Mr. maneesh";
//		t.walking();
//		t.teach();
//        
//		Singer s = new Singer();
//		s.name="akhil";
//		s.eat();
//		s.sing();
		/*
		 * This is up casting/implicit casting
		Teacher t = new Teacher();
		Person p = t;    */
		
		/*
		 * this is explicit casting/ down casting
		Teacher t = new Teacher();
		Person p = t;
		Teacher t1 = (Teacher) p;  */
		
		Teacher t1 = new Teacher();
		Singer s1 = new Singer();
		Person p = t1;
		Teacher t =  (Teacher) p;
		//how to check instances whether ture or false
		boolean b = t1 instanceof Person;
		System.out.println(t1 instanceof Teacher);
		System.out.println(s1 instanceof Singer);
		System.out.println(t1 instanceof Person);
		System.out.println(t instanceof Person);
		System.out.println(p instanceof Singer );
		
	}

}
