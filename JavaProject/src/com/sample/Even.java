package com.sample;
import java.util.*;
public class Even {

	public static void main(String[] args) {
		System.out.println("Enter a number to check");
		Scanner scan= new Scanner(System.in);
		double n= scan.nextDouble();
		if(n%2==0)
		{
			System.out.println("No.is even");
			
		}
		else
		{
			System.out.println("No.is odd");
		}
		

	}

}
