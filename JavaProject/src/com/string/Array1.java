package com.string;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args)
	{

		int[] a= new int[5];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the value in the array");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = in.nextInt();
		}
		
		System.out.println("Print all array value");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
