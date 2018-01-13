import java.util.ArrayList;
import java.util.List;

public class Collection1
{

	public static void main(String[] args) 
	{

		List l1 = new ArrayList();
		
		// add data to array list
		
		l1.add(1);
		l1.add("abc");
		l1.add('c');
		l1.add(10.01);
		
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		
		l1.remove(1);
		System.out.println("After remove the data ");
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		
		List l2 = new ArrayList();
		l2.add(40);
		l2.add("abcd");
		
		// add one array to another arraylist
		System.out.println("After adding the collection ");
		l2.addAll(l1);
		for(int i=0; i<l2.size(); i++)
		{
			System.out.println(l2.get(i));
		}
		
		
		
		
		
		
	}

}
