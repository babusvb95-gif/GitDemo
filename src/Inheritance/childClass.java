package Inheritance;

public class childClass {

	public void getData(int a) {
		System.out.println(a);
	}

	public void getData(String a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClassDemo a = new ChildClassDemo();
		System.out.println(a.colour);
		ChildClassDemo b = new ChildClassDemo();
		System.out.println(b.colour);

		childClass c = new childClass();
		c.getData(100);
		c.getData("Thiya");
		c.getData(10, 3);
	}

}
