package VariableTypes;

public class Variables {

	String name;
	String address;
	static String city;

	static {

		city = "Banglore";

	}

	public Variables(String name, String address) {
		this.name = name;
		this.address = address;

		System.out.println(name + " " + address + " " + Variables.city);

	}

	public static void getData() {

		System.out.println(city);
	}

	public static void main(String[] args) {

		Variables v = new Variables("Babu", "marthalli");
		Variables v1 = new Variables("Sandhya", "MGROAD");
		Variables v2 = new Variables("Thiya", "KSR");
		Variables.getData();
	}

}
