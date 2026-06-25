
public class ThisKeyword {
	
	int a=5;
	public void getData() {
		
		int a=6;
		System.out.println(a);
		System.out.println(a+this.a);
	}

	public static void main(String[] args) {
		ThisKeyword tk= new ThisKeyword();
		tk.getData();
		
	}

}
