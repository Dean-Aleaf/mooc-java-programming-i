
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int end = 1; number >= end; end++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int end = 1; number >= end; end++) {
            System.out.print(" ");
            //System.out.println("Spaces number" + number);
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spaces = size;
        for (int width = 1; size >= width; width++) {
            printSpaces(spaces - width);
            printStars(width);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int spaces = height;
        for (int width = 1; height >= width; width++) {
            //System.out.println("Spaces" + spaces);
            printSpaces(spaces - width);
            printStars(2 * width - 1);   
        } 
        for (int i = 1; i < 3; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
    

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
