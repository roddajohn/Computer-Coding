import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	while (1 == 1) {
	    String input = console.nextLine();
	    if (input.equals("because") || input.equals("Because")) {
		System.out.println("Shut up");
	    }
	    else if (input.equals("Rodda")) {
		    System.out.println("Secret Passcode Accepted");
	    }
	    else {
		System.out.println("Why " + input);
	    }
	}

	

	/*
	  Boolean Connectors:
	  '||': Or
	  '&&': And
	  '!': Not

	  Boolean Operators:
	  'String.equals(anotherString)': Return true iff String is equal to another Stirng
	  '==': Is equal to
	  '<': Is less than to
	  '<=': Is less than or equal to
	  '>': Is greater than
	  '>=': Is greater than or equal to
	  '!=': Is not equal to

	  'a > b': Return true or false --> If true, if statement will run
	  Example: if (a > b) { System.out.prinlnt("HI");} Since a is 0 and b is 0, a is not greater than 0
	 */
    }
}