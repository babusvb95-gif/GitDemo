package CollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Babu");
		hm.put(2, "Thiya");
		hm.put(3, "Sandhya");
		System.out.println(hm);
		System.out.println(hm.get(2));
		System.out.println(hm.get(42));
		Set et =hm.entrySet();
		Iterator it =et.iterator();
		while(it.hasNext()) {
			
			//System.out.println(it.next());
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey()); 
			System.out.println(mp.getValue());
			
		}

		
		
		
		

	}

}
