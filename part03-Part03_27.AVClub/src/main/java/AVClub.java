
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isOn = true;

        while (isOn) {
            String input = scanner.nextLine();
            String[] split = input.split(" ");
            if (input.equals("")) {
                isOn = false;
            } 
            for (int i = 0; i < split.length; i++) {
                if (split[i].contains("av")) {
                    System.out.println(split[i]);
                }
            }
        }
    }
}
