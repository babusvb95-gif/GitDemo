package Interview_Excercises;

import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		int[] a = { 4, 5, 4, 3, 5, 6, 4, 3, 2, 5, 6, 9 };

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			
			int k=0;
			
			
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						
						k++;
					}
					
				}
				
				System.out.println(k+" times ="+ a[i] );
				
				
				if(k==1) {
					System.out.println(a[i]+" is Unique number");
				}
			}
			
		}
		
		
	}

}
