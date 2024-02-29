package javaPractices;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("UK");
		hs.add("USA");
		hs.add("UK");
		
		System.out.println(hs);
		//System.out.println(hs.remove("USA"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		
		hs.add("He");
		hs.add("She");
		
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
