package MultiDimesionalArray;

public class MDIMArray {

	public static void main(String[] args) {
		int a[][]=new int[2][3];
		a[0][0]=1;
		a[0][1]=5;
		a[0][2]=8;
		a[1][0]=2;
		a[1][1]=5;
		a[1][2]=8;
		
	//	System.out.println(a[1][2]);
		
		//Another way to declare multidimensional array
		int b[][]= {{1,5,9},{6,5,4}};
		
		for(int i=0; i<2;i++) {
			
			for(int j=0;j<3;j++) {
				
				System.out.print(b[i][j]);
				System.out.print(" ");
			}
			
			System.out.println("");
		}

	}

}
