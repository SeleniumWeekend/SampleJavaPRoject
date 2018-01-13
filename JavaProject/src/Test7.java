import java.util.LinkedList;

public class Test7 {

	public static void main(String[] args) {

	LinkedList l1 = new LinkedList();
	
	LinkedList l2 = (LinkedList)l1.clone();

	System.out.println("Clone :"+l2);
		
		l1.add("Java");
		l1.add("Python");
		l1.add("C");
		l1.add("Selenium");
		l1.add("Java");
		
		// remove the first object from linked list and it return same deleted object
		Object o1 = l1.removeFirst();
		
		System.out.println(o1);
		
		// remove the last object from linked list and it return same deleted object
		Object o2 = l1.removeLast();
		
		System.out.println(o2);
		
		System.out.println("After removing the object ");
		
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}
		
		l1.add(2, "Java");
		
		System.out.println(l1);
		
		Object[] o3 = l1.toArray();
		
		for(int i=o3.length-1; i>=0; i--)
		{
			System.out.print(o3[i]+" ");
		}
		
	}

}
