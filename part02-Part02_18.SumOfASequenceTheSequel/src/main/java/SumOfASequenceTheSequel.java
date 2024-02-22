
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int start  = scanner.nextInt();
        System.out.print("Last number? ");
        int end = scanner.nextInt();
        int sum = 0;

        for (int number = start; number <= end; number++) {
            sum += number;
        }
        System.out.print("The sum is " + sum);
    }
}
