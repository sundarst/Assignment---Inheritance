class Vehicle
{
	public void engineStart()
	{
		System.out.println("Vehicle engine start");
	}
}
class Car extends Vehicle
{
	public void carEngineStart()
	{
		System.out.println("Car engine start");
	}
}
class Bike extends Vehicle
{
	public void bikeEngineStart()
	{
		System.out.println("Bike engine start");
	}
}
class Lorry extends Vehicle
{
	public void LorryEngineStart()
	{
		System.out.println("Lorry Engine start");
	}
}

public  class VehicleHierarchy
{
	
	public static void main(String[]args)
	{
		Lorry lorry=new Lorry();
		lorry.engineStart();
		Bike bike=new Bike();
		bike.engineStart();
		Car car = new Car();
		car.engineStart();
		
	}
}
