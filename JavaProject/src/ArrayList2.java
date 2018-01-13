import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add("Java");
		al.add("selenium");
		al.add("python");
		
		int index = al.indexOf("Java");
		System.out.println(index);
		
		
		boolean b = al.contains("selenium");
		System.out.println(b);
		
		al.add(2, "Perl");
		
		System.out.println("Using Iterator ");
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		// Verify Array list is empty or not
		ArrayList al1 = new ArrayList();
		boolean b1 = al1.isEmpty();
		
		System.out.println(b1);
		
		al1.add("Java");
		al1.add("python");
		
		boolean b2 = al.containsAll(al1);
		System.out.println(b2);
		
		
	}

}
