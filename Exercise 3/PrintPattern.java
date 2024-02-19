/**
 * PrintPattern
 */
public class PrintPattern {

    // Write a program using functions to print the following pattern:
    // *
    // **
    // ***
    // ****
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Write a program using functions to print the following pattern:
    // ****
    // ***
    // **
    // *
    public static void pattern2(int rows) {
        for (int x = rows; x >= 1; x--) {
            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        pattern1(4);

        System.out.println("-------------------------------------");

        pattern2(4);

    }
}