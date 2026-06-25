package Loops_Practice;

public class Nested_Loop_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=1; i<=4; i++) {
			
			
			
			for(int j=0; j<=4-i;j++) {
				
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
			
		}
	}

}
