package abstraction.interface_ex;

/**
 * Abstraction interface example in Java
 * 
 * @author Mamun Kayum
 *
 */
public class CallerMain {
	public static void main(String[] args) {
		Vehicle car = new Car();
		car.start();
		car.stop();
	}
}
