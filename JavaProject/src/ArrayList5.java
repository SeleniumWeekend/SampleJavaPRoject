import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayList5 {

	public static void main(String[] args) 
	{

		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Java");
		al.add("Python");
		al.add("Selenium");
		al.add(2, "Ruby");
		
		Object[] o1 = al.toArray();
		
		for(Object o : o1)
		{
			System.out.println(o);
		}
		
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("Java");
		l1.add("Python");
		l1.add("Selenium");
		
		l1.addFirst("Pritam");
		
		l1.addLast("Pooja");
		
		System.out.println(l1.getLast());
		System.out.println(l1.getFirst());
		
		String last = l1.removeLast();
		String first = l1.removeFirst();
		
		System.out.println(last+ " , "+first);
		
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println(v.capacity());
		
		for(int i = 1; i<=10; i++)
		{
			v.addElement(i);
		}
		
		v.add(0);
		
		System.out.println(v.capacity());
		
		
		
	}

}
