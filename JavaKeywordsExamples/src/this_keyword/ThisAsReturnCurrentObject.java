package this_keyword;

/**
 * This as return current object example
 * 
 * @author Mamun Kayum
 *
 */
public class ThisAsReturnCurrentObject {
	int instanceVariable = 10;

	ThisAsReturnCurrentObject setVal(int instanceVariable) {
		this.instanceVariable = instanceVariable;
		return this;
	}

	public int getVal() {
		return instanceVariable;
	}
}
