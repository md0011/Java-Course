import java.util.Scanner;  // Importing  the Scanner class

public class UserInput {

    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter number 1");
       int a = sc.nextInt();
       System.out.println("Enter number 2");
       int b = sc.nextInt();
//    float a = sc.nextFloat();
//    float b = sc.nextFloat();

       int sum = a + b;
       System.out.println("The sum of these numbers is");
       System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
        // String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);

        sc.close();

    }
    
}
