import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {

		Stack s1 = new Stack();
		
		// add the object in stack using push()
		s1.push("Java");
		s1.push("Python");
		s1.push("Selenium");
		
		// Fetch the first element from the offset
		Object o1 = s1.peek();
		
		System.out.println(o1);

		// remove the first element from the offset and return the same
		Object o2 = s1.pop();
		
		System.out.println(o2);
		
		Object o3 = s1.peek();
		
		System.out.println(o3);
		
		// Check whether the stack is empty or not
		boolean b = s1.empty();
		System.out.println(b);
		
		int index =s1.search("Java");
		System.out.println(index);
	}

}
