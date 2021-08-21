package map;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		
		Pen pen1 = new Pen(10, "blue");
		Pen pen2 = new Pen(10, "blue");
		
		//System.out.println(pen1==pen2);
		//System.out.println(pen1);
		//System.out.println(pen2);   //pen1 and pen2 both are at different location in memory
		//System.out.println(pen1.equals(pen2));  // returns false
		//after implement equal method  
		System.out.println(pen1);
		System.out.println(pen2);
		System.out.println(pen1.equals(pen2)); // this is showing both pens are equal
		
		Set<Pen> pens = new HashSet<>();
				pens.add(pen1);
				pens.add(pen2);
				//System.out.println(pens); //here HashSet can enter both entries 
				// of pen1 and pen2 it means hash set is not considering them equal
				//so we have to implement Hashcode
				
				//after implement hash code 
				
				System.out.println(pens);
		        //this is entring only one pen it means it consider both pens are same
				// according to equality of their price and color

	}

}

class Pen{
		int price;
		String color;

		public Pen(int price, String color) {
				this.price = price;
				this.color = color;
		}
		
		@Override
		public boolean equals(Object obj) {
			Pen that = (Pen) obj; //casting
			boolean isEqual = this.price==that.price && 
					this.color.equals(that.color);
			return isEqual;  //now this will show that pen1 and pen2 both are equal
		}//accordin equals function output both pens are equal and this may cause of occurring collision
		
		//so we have to improve hashCode to reduce collision
		
		@Override
		public int hashCode() {
			return price+color.hashCode();
		}
}

  // eclipse already gives the functionality to create hashCode()  and equals() by clicks some option
/*
 * 1) click source
 * 2) scroll down and click generate hashCode() and equals()
 * 3) select attributes for which you want to generate hashcode and equals
 * */










