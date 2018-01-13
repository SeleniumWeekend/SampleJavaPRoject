import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array value");
		
		int key = 25;
		
		int[] a = new int[7];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		
		int index = search(a, key);
		
		System.out.println(index);
	}
	
	static int search(int[] a, int key)
	{
		int first = 0;
		int last = a.length-1;
		
		int mid = first+last/2;
		
		while(first<last)
		{
			if(key==a[mid])
			{
				return mid+1;
			}
			else if(key<a[mid])
			{
				last = mid-1;
			}
			else
			{
				first = mid+1;
			}
			
			mid = first+last/2;
			
		}
		return mid;
	}
}
