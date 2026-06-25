package Constructors;

public class ConstructorDemo {

	public ConstructorDemo(int i, int j) {
		System.out.println(i+j);
	}
	public ConstructorDemo() {
		System.out.println("Default constructor executed");
	}

	public static void main(String[] args) {
		ConstructorDemo cd= new ConstructorDemo(5,6);
		ConstructorDemo c= new ConstructorDemo();
	}

}
