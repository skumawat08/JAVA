package oops;
class Vehicl
{
	int wheels;
	int headlights=2;
	String color;
	Vehicl(int wheels)
	{
		this.wheels=wheels;
	}
	
	Vehicl(int wheels,String color)
	{
		this.wheels=wheels;
		this.color=color;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Vehicl car=new Vehicl(4);
		Vehicl car1=new Vehicl(4,"red");
		System.out.println(car.wheels+" wheels");
		System.out.println(car1.wheels+" wheels and "+car1.color);

	}

}
