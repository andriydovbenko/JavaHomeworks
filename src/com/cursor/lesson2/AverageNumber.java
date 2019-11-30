package com.cursor.lesson2;
/**
 * This class created for performing task :
 * "You get an array of numbers, return the average of a list of numbers
 * in this array. (Example -  array{1,2,4,1} -> avg = 2)"
 *  @author Andrii Dovbenko
 */
public class AverageNumber {

    public static double computingTheAverageValue(int[] arrayOfDigit) {
        int tempValue = 0;
        for (int i : arrayOfDigit) {
            tempValue += i;
        }
        if (tempValue != 0) {
            return (tempValue/ (double) arrayOfDigit.length);
        }else return 0;
    }
}
