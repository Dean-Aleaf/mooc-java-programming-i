
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int end = scanner.nextInt();
        int sum = 0;
        int number = 1;

        while (number <= end) {
            sum += number;
            number++;
        }
        System.out.print("The sum is " + sum);
    }
}
/*
        for (int n = 2; n <= end; n++) {
            sum += n;
        }
        System.out.print("The sum is " + sum);
    }
}
*/