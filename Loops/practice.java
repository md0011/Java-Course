package Loops;

/**
 * practice
 */
public class practice {

    public static void main(String[] args) {

        // Question 1: Write a program to print the following pattern :
        // ****
        // ***
        // **
        // *

        System.out.println("Question 1: Write a program to print the pattern:-");

        int k = 4;
        for (int i = k; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("--------------------------------------------------------");

        System.out.println("Question 2: Write a program to sum first n even numbers:-");
        int sum = 0;
        int n = 4;
        for (int i = 0; i < n; i++) {
            sum = sum + (2 * i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
        // First 4 even numbers are - 0 2 4 6

        System.out.println("--------------------------------------------------------");

        System.out.println("Question 3: Write a program to print the multiplication table of a given number n:");
        int a = 5;
               //for(int i=0; i<10; i++) - Goes from i=0 to i=9
               for(int i=1;i<=10;i++){
                   System.out.printf("%d X %d = %d\n", a, i, a*i);
               }

        System.out.println("--------------------------------------------------------");

    }
}