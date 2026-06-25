package CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

	public static void main(String[] args) {
		//HashSet, TreeSet and LinkedHashSet are implementing the set interface.
		//It doesn't allows duplicates.
		//There is no guarantee in sequence order.
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("America");
		hs.add("canada");
		hs.add("Africa");
		hs.add("India");
		hs.add("Africa");
		System.out.println(hs);
		//hs.remove("Africa");
		System.out.println(hs);
	System.out.println(hs.contains("Africa"));
		System.out.println(hs.isEmpty());
		
	Iterator<String> i= hs.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
		
		
		

	}

}
