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
        
        System.out.println("-----------------------------------------------------------------------------");

    }
}