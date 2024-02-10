package Arrays;

/**
 * Practice
 */
public class Practice {

    public static void main(String[] args) {
        
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Question 1. Create an array of 5 floats and calculate their sum:");
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);

        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.println("Question 2. Write a program to find out whether a given integer is present in an array or not:");
        float[] marks1 = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };
        float num = 45.75f;
        boolean isInArray = false;
        for (float element1 : marks1) {
            if (num == element1) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array!");
        } else {
            System.out.println("The value is not present in the array!");
        }

        System.out.println("-----------------------------------------------------------------------------------------------------");

    }
}