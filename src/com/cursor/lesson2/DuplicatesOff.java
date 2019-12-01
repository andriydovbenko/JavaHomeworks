package com.cursor.lesson2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatesOff {

    private static int[] arrayOfDigits;
    private static Set<Integer> setUnique = new LinkedHashSet<>();
    private static int counter = 0;

    DuplicatesOff() {
        arrayOfDigits = new int[]{3, 2, 3, 1, 4, 2, 8, 3};
    }

    DuplicatesOff(int[] array) {
        arrayOfDigits = array;
    }

    private static void checkUniqueness(int digit) {
        for (int i : setUnique) {
            if (digit == i) {
                arrayOfDigits[counter] = 0;
                break;
            }
        }
    }

    public int [] replacingDuplicates () {
        System.out.println("Original array: "+ Arrays.toString(arrayOfDigits));
        for (int i = 0; i < arrayOfDigits.length; i++) {
            if (i == 0) {
                setUnique.add(arrayOfDigits[i]);
                counter++;
            }else {
                checkUniqueness(arrayOfDigits[i]);
                setUnique.add(arrayOfDigits[i]);
                counter++;
            }
        }
        return arrayOfDigits;
    }
}

