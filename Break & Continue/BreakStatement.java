/**
 * BreakStatement
 */
public class BreakStatement {

    public static void main(String[] args) {
        // Using 'for' Loop 
        System.out.println("Using 'for' Loop:");
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
        }

        System.out.println("-------------------------");

        // Using 'do while' Loop 
        System.out.println("Using 'do while' Loop:");
        int i = 0;
        do {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("Ending the loop");
                break;
            }
            i++;
        } while (i < 5);
        System.out.println("Loop ends here");

    }
}