package Inheritance;

public class ChildClassDemo extends ParentClassDemo{

	
	public void carColour() {
		System.out.println(colour);
	}
	
	//String colour = "Red";
	public static void main(String[] args) {
		
		ChildClassDemo cd = new ChildClassDemo();
		cd.Brake();;
		cd.engine();;
		cd.carColour();
	
	}

}
