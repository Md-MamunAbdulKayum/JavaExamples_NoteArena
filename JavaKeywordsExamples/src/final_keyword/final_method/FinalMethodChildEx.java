package final_keyword.final_method;

/**
 * Final Method Child Example
 * @author Mamun Kayum
 *
 */
public class FinalMethodChildEx extends FinalMethodParentEx {
	// This will give a compile-time error "Cannot override the final method from FinalMethodParentEx"
	//public void printMessage() {
	//	System.out.println("This method cannot be overridden.");
	//}
}
