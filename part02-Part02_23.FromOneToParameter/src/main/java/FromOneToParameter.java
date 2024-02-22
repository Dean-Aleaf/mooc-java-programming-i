

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    public static void printUntilNumber(int number) {
        for (int start = 1; start <= number; start++) {
            System.out.println(start);
        }
    }
}
