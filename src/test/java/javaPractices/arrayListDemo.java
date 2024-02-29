package javaPractices;

import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("virendra");
		a.add("Java");
		System.out.println(a);

		
		a.add("Employee");
		System.out.println(a);
		System.out.println(a.get(2));
		//System.out.println(a);
		//a.remove(1);
		//a.remove(0);
		//System.out.println(a.removeAll(a));
		a.addFirst("java");
		a.addLast("Employee");
		//System.out.println(a);
		//System.out.println(a.contains("java"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		System.out.println(a);
		
	}

}
