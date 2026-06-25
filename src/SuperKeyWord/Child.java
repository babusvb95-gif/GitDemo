package SuperKeyWord;

import java.lang.classfile.Superclass;

public class Child extends Parent {
	
	public Child() {
		
		System.out.println("I am child constructor");
	}
	
	String name ="Sharanya";
	
	public void getStringData() {

		System.out.println(name);
		System.out.println(super.name);
	}
public void getDataA() {
		super.getDataA();
		System.out.println("I am From child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		//c.getStringData();
		//c.getDataA();
	}

}
