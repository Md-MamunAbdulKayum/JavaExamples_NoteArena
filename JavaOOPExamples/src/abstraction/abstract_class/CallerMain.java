package abstraction.abstract_class;

/**
 * Abstraction abstract class example in Java
 * 
 * @author Mamun Kayum
 *
 */
public class CallerMain {
	public static void main(String[] args) {
		Shape circle = new Circle("red", 5.0);
		System.out.println("Area of circle: " + circle.getArea());
		System.out.println("Color of circle: " + circle.getColor());
	}
}
