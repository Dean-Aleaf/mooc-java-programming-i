
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a string; ");
        String guess = scanner.nextLine();

        if (guess.equals("true")) {
            System.out.print("You got it right!");
        } else {
            System.out.print("Try again!");
        }

    }
}
