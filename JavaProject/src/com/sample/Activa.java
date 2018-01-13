package com.sample;

class Bike
{
	int gear;
	int speed=60;
	
	public void changeGear(int gearNo)
	{
		gear = gearNo;
		System.out.println(gear);
	}
	
	public void applyBreak(int decrement)
	{
		speed = speed-decrement;
		System.out.println(speed);
	}
	
	public void speedUp(int increment)
	{
		speed = speed+increment;
		System.out.println(speed);
	}
}

public class Activa extends Run
{
	
	public static void main(String[] args)
	{
		Run b1 = new Run();
		
		
	}

}
