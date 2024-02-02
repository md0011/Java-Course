package Loops;

public class ForLoop {
    public static void main(String[] args) {
        /*

         * for (initialize; check_bool_expression; update){
         * //code;
         * }
         
         */

        // Print 10 numbers:
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Print even & odd numbers:
        // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.println(2 * i + 1);
        }

        for (int i = 5; i != 0; i--) {
            System.out.println(i);
        }
    }
}
