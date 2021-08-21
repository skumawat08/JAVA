package staticKeyword;

import staticKeyword.A.B; //imported inner class B for making object
import staticKeyword.A.C; //imported inner class C for making object

public class StaticKeyword {

	public static void main(String[] args) {
		A objA = new A();
		B objB = objA.new B();  //object of non-static inner class B
		C objC = new A.C();     //object of static inner class C 
	}

}
