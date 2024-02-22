
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int end = scanner.nextInt();
        System.out.print("Where from? ");
        int start = scanner.nextInt();

        for (int n = start; n <= end; n++) {
            System.out.println(n);
        }

    }
}
