package this_keyword;

/**
 * This Keyword Example to Avoid Naming Conflicts
 * 
 * @author Mamun Kayum
 *
 */
public class ThisKeywordExAvoidNamingConflicts {
	int instanceVariable;

	public ThisKeywordExAvoidNamingConflicts(int instanceVariable) {
		this.instanceVariable = instanceVariable;
	}
	
	void methodName(int instanceVariable) {
		this.instanceVariable = instanceVariable;
	}
	
	public static void main(String[] args) {
		ThisKeywordExAvoidNamingConflicts avoidNamingConflicts = new ThisKeywordExAvoidNamingConflicts(10);
		System.out.println("instanceVariable value: " + avoidNamingConflicts.instanceVariable);
	}
}
