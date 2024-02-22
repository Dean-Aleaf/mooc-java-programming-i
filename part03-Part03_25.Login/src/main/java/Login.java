
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alex = "sunshine";
        String emma = "haskell";

        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (user.equals("alex") && password.equals(alex) ) {
            System.out.print("You have successfully logged in!");
        } else if (user.equals("emma") && password.equals(emma)) {
            System.out.print("You have successfully logged in!");
        } else {
            System.out.print("Incorrect username or password!");
        }

    }
}
