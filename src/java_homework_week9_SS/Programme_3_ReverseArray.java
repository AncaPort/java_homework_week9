package java_homework_week9_SS;
/**
 * Write a Java program to reverse an array of integer values
 */

import java.util.Arrays;

public class Programme_3_ReverseArray {

    public static void main(String[] args) {//main method
        //declare array
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));

        reverseArray(array);//static method calling
        System.out.println("Reversed array:" + Arrays.toString(array));
    }

    public static void reverseArray(int[] a) {//static method for reverse an array
        int first = 0;
        int second = a.length - 1;

        while (first < second) {
            int temp = a[first];//swap first value into second value
            a[first] = a[second];
            a[second] = temp;

            first++;
            second--;

        }
    }
}
