package final_keyword;

/**
 * Final variable example
 * 
 * @author Mamun Kayum
 *
 */
public class FinalKeywordEx {
	final int MAX_VALUE = 100;

	public static void main(String[] args) {
		FinalKeywordEx ex = new FinalKeywordEx();
		ex.printMaxVal();
	}

	void printMaxVal() {
		System.out.println("max value: " + MAX_VALUE);

		// MAX_VALUE = 10; // this will an compilation error "The final field
		// FinalKeywordEx.MAX_VALUE cannot be assigned"
	}
}
