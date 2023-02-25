package static_keyword;

/**
 * Java static keyword example
 * 
 * @author Mamun Kayum
 *
 */
public class StaticKeyword {

	// static variable declaration and initialization
	static int numCars = 0;
	String make;
	String model;

	/**
	 * StaticKeyword constructor
	 * 
	 * @param make
	 * @param model
	 */
	public StaticKeyword(String make, String model) {
		this.make = make;
		this.model = model;
		// incrementing static variable without using this keyword
		numCars++;
	}

	/**
	 * static method
	 * 
	 * @return numCars
	 */
	public static int getNumCars() {
		return numCars;
	}

	/**
	 * non-static method
	 * 
	 * @return make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * non-static method
	 * 
	 * @return model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		StaticKeyword car1 = new StaticKeyword("Toyota", "Camry");
		StaticKeyword car2 = new StaticKeyword("Honda", "Civic");
		// accessing static method
		System.out.println("Number of cars created: " + StaticKeyword.getNumCars());

		System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel());
		System.out.println("Car 2: " + car2.getMake() + " " + car2.getModel());
	}
}
