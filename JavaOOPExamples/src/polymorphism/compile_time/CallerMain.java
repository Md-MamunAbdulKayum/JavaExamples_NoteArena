package polymorphism.compile_time;

/**
 * Compile-time polymorphism example
 * 
 * @author Mamun Kayum
 *
 */
public class CallerMain {
	public static void main(String[] args) {
		System.out.println(MathUtils.add(1, 2));
		System.out.println(MathUtils.add(1.0, 2.0));
		System.out.println(MathUtils.add(1, 2, 3));
	}
}
