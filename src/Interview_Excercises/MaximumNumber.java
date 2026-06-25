package Interview_Excercises;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,5,8},{0,5,6},{9,10,15}};
		int max = a[0][0];
		
		for(int i=0; i<3; i++) {
			
			for(int j=0;j<3;j++) {
				
				if(a[i][j]>max) {
					
					max=a[i][j];
				}
			}
		}
System.out.println("Maximum number is : "+ max);
	}

	}


