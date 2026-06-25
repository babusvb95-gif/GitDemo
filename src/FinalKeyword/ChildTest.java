package FinalKeyword;

public class ChildTest extends ParentTest {
	final int a =10;
	
public void data() {

	System.out.println("I am child");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildTest ct = new ChildTest();
		ct.data();
	
	}

}
