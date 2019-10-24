package homework2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	numbers number = new numbers();

	Scanner scan = new Scanner(System.in);
	System.out.print("Enter number A: ");
	number.a = scan.nextInt();
	System.out.print("Enter number A: ");
	number.b = scan.nextInt();
	scan.close();

	number.printNumbers();
	System.out.println("\n");

	number.divisorsOfA(number.a);
	System.out.println("\n");

	number.simpleDivisorsOfB(number.b);
	System.out.println("\n");


    }
}
