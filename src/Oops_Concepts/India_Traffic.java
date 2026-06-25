package Oops_Concepts;

public class India_Traffic implements Central_Traffic, Continental_Traffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Central_Traffic a = new India_Traffic();
		a.Red();
		a.Orange();
		a.Green();
		
		Continental_Traffic ct = new India_Traffic();
		ct.walkin();
	}

	@Override
	public void Red() {
		// TODO Auto-generated method stub
		System.out.println("Red: Stop Implementation");
		
	}

	@Override
	public void Orange() {
		// TODO Auto-generated method stub
		System.out.println("Orange : Get Ready");
	}

	@Override
	public void Green() {
		// TODO Auto-generated method stub
		System.out.println("Green: Go ");
	}

	@Override
	public void walkin() {
		System.out.println("Everyone Lets Walk");
		
	}

}
