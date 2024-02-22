
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num1 = scanner.nextInt();
            if (num1 == 0) {
                break;
            } else {
                numOfNum += 1;
            }
        }
        System.out.println("Number of numbers: " + numOfNum);
    }
}
        