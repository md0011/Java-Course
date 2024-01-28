/* Write a program to calculate the percentage of a given student in the CBSE board exam. 
His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100) */

import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Physics marks : ");
        int physics = scan.nextInt();
        System.out.print("Enter your English marks : ");
        int English = scan.nextInt();
        System.out.print("Enter your Chemistry marks : ");
        int chemistry = scan.nextInt();
        System.out.print("Enter your Mathematics marks : ");
        int mathematics = scan.nextInt();
        System.out.print("Enter your Computer Science marks : ");
        int computer = scan.nextInt();

        float percentage = ((physics + English + chemistry + mathematics + computer)/500.0f)*100;

        System.out.println("percentage : " + percentage);

        scan.close();
    }
}