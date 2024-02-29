package javaPractices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class haseMapexample {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "afternoon");
		hm.put(7, "evening");
		hm.put(3, "Night");
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		hm.remove(7);
		//System.out.println(hm);
		
		Set set = hm.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			
			System.out.println(it.next());
			
			/*
			 * Map.Entry mp = (Map.Entry)it.next(); System.out.println(mp.getKey());
			 * System.out.println(mp.getValue());
			 */
			 
			
		}

	}

}
