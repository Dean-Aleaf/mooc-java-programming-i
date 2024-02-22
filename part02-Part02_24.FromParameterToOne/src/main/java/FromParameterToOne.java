

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int number) {
        for (int end = number; end > 0; end--) {
            System.out.println(end);
        }
    }
}
