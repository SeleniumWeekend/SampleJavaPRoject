package com.string;

import java.util.Scanner;

public class LargestValue {

	public static void main(String[] args) {
		int[] a = arrayVal();
		
		System.out.println("Print all array value");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}
	
	static int[] sort(int a[])
	{
		int temp =0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j =0; j<a.length-i-1; j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		return a;
	}
	
	static int[] arrayVal()
	{
		Scanner in = new Scanner(System.in);
		
		int[] a= new int[5];
		System.out.println("Enter the value in the array");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = in.nextInt();
		}
		
		int[] a1 = sort(a);
		
		return a1;
	}

}
