
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sn1 = 0;
        int nn1 = 0;

        while (true) {
            System.out.println("Give a number:");
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            } else {
                sn1 += n;
                nn1 += 1;
            }
        }
        System.out.println("Number of numbers: " + nn1 + "\nSum of the numbers: " + sn1);
    }
}
