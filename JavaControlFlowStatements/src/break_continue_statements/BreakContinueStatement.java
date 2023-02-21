package break_continue_statements;

public class BreakContinueStatement {
	  public static void main(String[] args) {
		    for (int i = 1; i <= 10; i++) {
		      if (i == 5) {
		        break;
		      }
		      if (i == 3 || i == 7) {
		        continue;
		      }
		      System.out.print(i + " ");
		    }
		    System.out.println("Loop has ended");
      }
}
