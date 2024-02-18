/**
 * MultiplicationTable
 */
public class MultiplicationTable {

    static void printMultiplicationTable(int n) {
        // Check if n is positive
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        // Loop through numbers from 1 to 12
        for (int i = 1; i <= 10; i++) {
            // Print the multiplication result with formatting
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {

        // Write a Java method to print the multiplication table of a number n.
        printMultiplicationTable(3);

    }
}