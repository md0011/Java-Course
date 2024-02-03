public class ContinueStatement {
    public static void main(String[] args) {
        // Using 'for' Loop
        System.out.println("Using 'for' Loop:");
        for (int i = 0; i <= 10; i++) {
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
        int i = 0;

        System.out.println("-------------------------");

        // Using 'do while' Loop
        System.out.println("Using 'do while' Loop:");
        do {
            i++;
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        } while (i < 5);
        System.out.println("Loop ends here");

    }

}
