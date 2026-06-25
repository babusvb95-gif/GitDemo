package Interview_Excercises;

public class PrintMinNumber {

	public static void main(String[] args) {
		int a[][]= {{1,5,8},{0,5,6},{9,10,15}};
		int min = a[0][0];
		
		for(int i=0; i<3; i++) {
			
			for(int j=0;j<3;j++) {
				
				if(a[i][j]<min) {
					
					min=a[i][j];
				}
			}
		}
System.out.println("smallest number is : "+ min);
	}

}
