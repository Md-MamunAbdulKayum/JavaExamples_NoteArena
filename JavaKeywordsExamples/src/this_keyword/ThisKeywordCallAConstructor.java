package this_keyword;
/**
 * This Keyword example to call a Constructor
 * @author Mamun Kayum
 *
 */
public class ThisKeywordCallAConstructor {
    int instanceVariable;

    ThisKeywordCallAConstructor(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    ThisKeywordCallAConstructor() {
        this(30); // calls the other constructor with 0 as the argument
    }
    
    public static void main(String[] args) {
    	// initializing ThisKeywordCallAConstructor class with no argument constructor
    	ThisKeywordCallAConstructor callAConstructor = new ThisKeywordCallAConstructor();
    	
    	System.out.println("instanceVariable value: "+callAConstructor.instanceVariable);
	}
}
