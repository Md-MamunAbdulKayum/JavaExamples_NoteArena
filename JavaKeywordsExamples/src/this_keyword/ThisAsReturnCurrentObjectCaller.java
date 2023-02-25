package this_keyword;

/**
 * This as return current object caller
 * 
 * @author Mamun Kayum
 *
 */
public class ThisAsReturnCurrentObjectCaller {
	public static void main(String[] args) {
		ThisAsReturnCurrentObject asReturnCurrentObject = new ThisAsReturnCurrentObject();

		// setting value and getting the instance of the current object
		ThisAsReturnCurrentObject currentObject = asReturnCurrentObject.setVal(100);

		System.out.println("Value is: " + currentObject.getVal());
	}
}
