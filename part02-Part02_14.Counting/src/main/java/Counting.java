
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int end = scanner.nextInt();

        for (int start = 0; start <= end; start++) {
            System.out.println(start);
        }
    }
}
