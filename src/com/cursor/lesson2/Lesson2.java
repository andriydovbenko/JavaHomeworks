package com.cursor.lesson2;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        //first task:
        DescendingArraySort descendingArraySort = new DescendingArraySort();
        descendingArraySort.transformInDescendingOrder();

        //second task:
        int[] numbersArray = {1, 4, -45, 12, 8, -22, 0, -3, 7, -89, 7};
        int sumOfPositive = SumOfThePositiveNumbers.computingPositiveNumbers(numbersArray);
        System.out.println("Sum of positive digits of array : " + sumOfPositive);

        //third task:
        double averageValue = AverageNumber.computingTheAverageValue(numbersArray);
        System.out.println("Average of a list of numbers: " + averageValue);

        //last one
        DuplicatesOff duplicatesOff = new DuplicatesOff();
        int [] newArray = duplicatesOff.replacingDuplicates();
        System.out.println("Modified array: "+Arrays.toString(newArray));
    }
}
