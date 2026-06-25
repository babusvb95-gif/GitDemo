package Abstraction;

public class Indian_Airlines extends AirCraft_Design{

	public static void main(String[] args) {
		
		Indian_Airlines ia = new Indian_Airlines();
		ia.engine();
		ia.safety();
		ia.colour();

	}

	@Override
	public void colour() {
		System.out.println("Red Color For This Flight");
		
	}

}
