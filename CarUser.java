class Car
{
	private Car(){}
	static class Engine
	{
		static Car start()
		{
			Car obj = new Car();
			return obj;
		}
	}
	public void drive()
	{
		System.out.println("Drive your Car....");
	}
}

class CarUser
{
	public static void main(String[] args)
	{
		Car myCar = Car.Engine.start();
		myCar.drive();
	}
}