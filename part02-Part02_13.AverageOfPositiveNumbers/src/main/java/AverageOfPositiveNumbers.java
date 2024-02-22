
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sn1 = 0;
        double nn1 = 0;

        while (true) {
            System.out.println("Give a number:");
            double n = scanner.nextDouble();

            if (n == 0) {
                break;
            } else if (n < 0) {
                continue;
            } else {
                sn1 += n;
                nn1 += 1;
            }
        }
        double an = sn1 / nn1;
        if (sn1 == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + an);
        }
    }   
}

