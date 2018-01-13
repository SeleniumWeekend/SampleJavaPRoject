import java.util.LinkedList;

public class Test6 {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		
		l1.add("Java");
		l1.add("Python");
		l1.add("C");
		l1.add("Selenium");
		l1.add("Java");
		
		for(int i=0; i<l1.size(); i++)
		{
			// Fatch the data from link list using get()
			System.out.println(l1.get(i));
		}
		
		Object o1 = l1.getFirst();
		
		System.out.println("First Object : "+o1);
		
		Object o2 = l1.getLast();
		
		System.out.println("Last Object : "+o2);
		
		l1.addFirst("Ruby");
		l1.addLast("PHP");
		System.out.println();
		System.out.println("After Adding the new Value");
		
		for(int i=0; i<l1.size(); i++)
		{
			// Fatch the data from link list using get()
			System.out.println(l1.get(i));
		}
		
		
		
		
		
	}

}
