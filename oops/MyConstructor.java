package oops;

class Vehicle
{
	int wheels;     //"this" keyword which is described below is taking refrence of int wheels
	
//	Vehicle(int noOfwheels)  //parameterized constructor bcz it's taking arguments
//	{
//		wheels =noOfwheels;
//	}
	
	Vehicle(int wheels)
	{
		this.wheels=wheels;        //this keyword is taking refrence of actual int wheels
	}
}

public class MyConstructor {
	
//			MyConstructor()    //No-argument constructor bcz it is not taking any parameter
//			{
//				System.out.println("object of constructor is created");
//			}
			public static void main(String[] args)
			{
				//MyConstructor obj = new MyConstructor();
				
				Vehicle car = new Vehicle(4);
				Vehicle scooty =  new Vehicle(2);
				System.out.println(car.wheels+" wheels");
				System.out.println(scooty.wheels+" wheels");
				
			}
}
