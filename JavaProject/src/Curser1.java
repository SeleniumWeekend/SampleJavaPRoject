import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Curser1 {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		
		l1.add("Java");
		l1.add("Python");
		l1.add("Selenium");
		l1.add("Perl");
		
		ListIterator litr= l1.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("Retrive the object in backward direction : ");
		 
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}

}
