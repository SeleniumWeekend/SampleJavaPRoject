import java.util.ArrayList;
import java.util.ListIterator;

public class Stack1 {

	public static void main(String[] args) {

		ArrayList s1 = new ArrayList();
		s1.add("Java");
		s1.add("Python");
		s1.add("Selenium");
		
//		System.out.println(s1);
		
		ListIterator li = s1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("After");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		
		
		
	}

}
