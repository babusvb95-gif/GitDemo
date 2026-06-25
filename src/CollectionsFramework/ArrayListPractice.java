package CollectionsFramework;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Babumanikandan");
		a.add("Thiya");
		a.add("Sandhya");
		a.add("Sandhya");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		a.add(0, "Vasanthi");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("Thiya"));
		System.out.println(a.indexOf("Sandhya"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());

	}

}
