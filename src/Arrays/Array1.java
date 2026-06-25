package Arrays;

import AccessModifiers.ClassB;

public class Array1 extends ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20 ;
		a[2] = 30;
		a[3] = 40 ;
		a[4] = 50;
		
		for(int i=0 ;i<a.length; i++) {
			
			System.out.println(a[i]);
			
//			ClassB b= new ClassB();
//			b.defaultData();
			
			Array1 ar= new Array1();
			ar.defaultData();
		}
	}

}
