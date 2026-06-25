package Interview_Excercises;

public class Min_MaxValue {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 9 }, { 1, 2, 0 }, { 5, 10, 15 } };
		int minimum = a[0][0];
		int miniColumn = 0;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (a[i][j] < minimum) {

					minimum = a[i][j];
					miniColumn = j;
				}
			}

		}
		System.out.println("minimum values is : " + minimum);
		System.out.println("minimum value columns is : " + miniColumn);
		int k = 0;
		int maximum = a[k][miniColumn];

		while (k < 3) {
			if (a[k][miniColumn] > maximum) {
				maximum = a[k][miniColumn];
			}
			k++;
		}
		
		System.out.println("Maximum values is : " + maximum);
	}

}
