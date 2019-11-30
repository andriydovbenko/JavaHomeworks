package com.cursor.lesson2;

/**
 * This class created for performing task :
 * "You get an array of numbers(should contain both positive and negative numbers),
 * and return the sum of all the positive ones. (If there are nothing to sum, sum should be 0)"
 *
 * @author Andrii Dovbenko
 */
public class SumOfThePositiveNumbers {

    public static int computingPositiveNumbers(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }
}
