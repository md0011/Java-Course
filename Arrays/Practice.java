package Arrays;

/**
 * Practice
 */
public class Practice {

    public static void main(String[] args) {
        
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Question 1. Create an array of 5 floats and calculate their sum:");
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");

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

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Question 3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop:");
        float [] marks2 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum2 = 0;
        for(float element2:marks2){
            sum2 = sum2 + element2;
        }
        System.out.println("The value of average marks is " + sum2/marks2.length);

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Question 4. Create a Java program to add two matrices of size 2x3:");
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------");

    }
}