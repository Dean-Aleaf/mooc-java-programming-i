
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = 100;

        for (int n = start; n <= end; n++) {
            System.out.println(n);
        }
    }
}
