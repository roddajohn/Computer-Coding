import java.util.Scanner; 
public class Calculator {
    public static void main(String [] args) {
	Scanner console = new Scanner(System.in);
	System.out.print("Do you want to add (1) subtract (2) multiply (3) or divide (4): ");
	int input = Integer.parseInt(console.nextLine());
	System.out.print("Please enter the first number: ");
	double a = Integer.parseInt(console.nextLine());
	System.out.print("Please enter the second number: ");
	double b = Integer.parseInt(console.nextLine());

	if (input == 1) {
	    System.out.println(a + b);
	}
	else if (input == 2) {
	    System.out.println(a - b);
	}
	else if (input == 3) {
	    System.out.println(a * b);
	}
	else if (input == 4) {
	    System.out.println(a / b);
	}
	else {
	    System.out.println("Unrecognized Input");
	}

 }

}