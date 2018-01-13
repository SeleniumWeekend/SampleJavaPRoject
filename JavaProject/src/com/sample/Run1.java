package com.sample;

class AA
{
	private int i = 10;
	
	public void setValue(int i)
	{
		this.i=i;
	}
	
	public int getValue()
	{
		return i;
	}
}


public class Run1 
{
	public static void main(String[] args) 
	{
		AA a1 = new AA();
		a1.setValue(30);
		int val= a1.getValue();
		System.out.println(val);
		int j = val+20;
		System.out.println(j);
	}

}
