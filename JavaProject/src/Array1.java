import java.util.Scanner;

public class Array1 {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array value");
		
		int key = 25;
		
		int[] a = new int[7];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			if(key==a[i])
			{
				System.out.println("key is present : "+a[i]+" : at index : "+i);
			}
		}
		
		
		
		
	}

}
