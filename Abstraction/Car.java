package Abstraction;

public abstract class Car {

			public abstract void accelerate();
			
			public abstract void breaking();
			
			public void honk()  // this is a concrete method
			{
				System.out.println("car is honking");
			}
}
