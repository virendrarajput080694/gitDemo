package javaPractices;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("USA");
		hs.add("UK");
		hs.add("Gujrat");
		hs.add("Haryana");
		hs.add("INDIA");
		hs.add("Punjab");
		System.out.println(hs);
		hs.add("INDIA");
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("INDIA"));
		//System.out.println(hs);
		Iterator<String> it =   hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
