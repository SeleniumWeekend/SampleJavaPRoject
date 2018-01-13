package com.sample;


class Bike1 
{
}

class Activa1 extends Bike1
{
	void startActiva()
	{
		System.out.println("Activa Start");
	}
}

class Scooty extends Bike1
{
	void scootyStart()
	{
		System.out.println("Scooty Start");
	}
	
}

class Driver
{
	static Bike1 getBike(String bikeName)
	{
		Bike1 b1=null;
		if(bikeName.equals("Activa"))
		{
			b1 = new Activa1();
		}
		if(bikeName.equals("Scooty"))
		{
			b1 = new Scooty();
		}
		
		return b1;
		
	}
}

public class Run
{
	public static void main(String[] args)
	{
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("Enter BikeName");
		String bikeName = scn.next();
		Bike1 b1 = Driver.getBike(bikeName);
		if(b1 instanceof Activa1)
		{
			Activa1 a1 = (Activa1)b1;
			a1.startActiva();
		}
		if(b1 instanceof Scooty)
		{
			Scooty s1 = (Scooty)b1;
			s1.scootyStart();
		}
	}
	
}
