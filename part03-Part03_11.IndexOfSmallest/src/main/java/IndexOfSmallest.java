
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            } else {
                numbers.add(input);
            }
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallest = numbers.get(0);
        int index = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < smallest) {
                smallest = numbers.get(i);
                index = i;
            }
        }
        System.out.printf("Smallest number: %d\nFound at index: %d", smallest, index);        
    }
}
