package javaPractices;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Virendra");
		a.add("Java");
		a.add("java");
		System.out.println(a);
		
		a.add(0, "Employee");
		System.out.println(a);
		/*
		 * a.remove(0); a.remove(1);
		 */
		
		//a.removeAll(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("Virendra"));
		System.out.println(a.indexOf("Virendra"));
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		
		a.add("Virendra");
		a.add("Java");
		a.add("java");
		System.out.println(a);
		


	}

}
