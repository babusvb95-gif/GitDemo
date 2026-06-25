package TryCatchMechanism;

public class extest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=5;
		int j = 0;
		
		try {
		int k= i/j;
		System.out.println(k);
		}
		catch (ArithmeticException e) {
			
			System.out.println("Arithmatic exception");
		}
		catch (Exception e) {
			System.out.println(" exception");
		}
		
	finally {
		System.out.println("Delete cookies");
		System.out.println("Close the browser");
	}
	}

}
