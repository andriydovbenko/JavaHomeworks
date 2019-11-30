package com.cursor.lesson1;

/**
 * This is homework to lesson 1.
 * ""H/W Intro""
 * @author Andrii Dovbenko
 */

public class Task1 {

    //method executes all operators with type: byte
    private static void bytePrimitives(byte e1, byte e2) {
        System.out.println("Byte type operations: ");
        System.out.println(e1 + " + " + e2 + " = " + (e1 + e2));
        System.out.println(e1 + " - " + e2 + " = " + (e1 - e2));
        System.out.println(e1 + " * " + e2 + " = " + (e1 * e2));
        System.out.println(e1 + " / " + e2 + " = " + (e1 / e2));
        System.out.println(e1 + " % " + e2 + " = " + (e1 % e2)+"\n");
    }

    //method executes all operators with type: short
    private static void shortPrimitives(short e1, short e2) {
        System.out.println("Short type operations: ");
        System.out.println(e1 + " + " + e2 + " = " + (e1 + e2));
        System.out.println(e1 + " - " + e2 + " = " + (e1 - e2));
        System.out.println(e1 + " * " + e2 + " = " + (e1 * e2));
        System.out.println(e1 + " / " + e2 + " = " + (e1 / e2));
        System.out.println(e1 + " % " + e2 + " = " + (e1 % e2)+"\n");
    }

    //method executes all operators with type: int
    private static void intPrimitives(int e1, int e2) {
        System.out.println("Int type operations: ");
        System.out.println(e1 + " + " + e2 + " = " + (e1 + e2));
        System.out.println(e1 + " - " + e2 + " = " + (e1 - e2));
        System.out.println(e1 + " * " + e2 + " = " + (e1 * e2));
        System.out.println(e1 + " / " + e2 + " = " + (e1 / e2));
        System.out.println(e1 + " % " + e2 + " = " + (e1 % e2)+"\n");
    }

    //method executes all operators with type: long
    private static void longPrimitives(long e1, long e2) {
        System.out.println("Long type operations: ");
        System.out.println(e1 + " + " + e2 + " = " + (e1 + e2));
        System.out.println(e1 + " - " + e2 + " = " + (e1 - e2));
        System.out.println(e1 + " * " + e2 + " = " + (e1 * e2));
        System.out.println(e1 + " / " + e2 + " = " + (e1 / e2));
        System.out.println(e1 + " % " + e2 + " = " + (e1 % e2)+"\n");
    }

    //method executes all operators with type: float
    private static void floatPrimitives(float e1, float e2) {
        System.out.println("Float type operations: ");
        System.out.println(e1 + " + " + e2 + " = " + (e1 + e2));
        System.out.println(e1 + " - " + e2 + " = " + (e1 - e2));
        System.out.println(e1 + " * " + e2 + " = " + (e1 * e2));
        System.out.println(e1 + " / " + e2 + " = " + (e1 / e2));
        System.out.println(e1 + " % " + e2 + " = " + (e1 % e2)+"\n");
    }

    //method executes all operators with type: double
    private static void doublePrimitives(double e1, double e2) {
        System.out.println("Double type operations: ");
        System.out.println(e1 + " + " + e2 + " = " + (e1 + e2));
        System.out.println(e1 + " - " + e2 + " = " + (e1 - e2));
        System.out.println(e1 + " * " + e2 + " = " + (e1 * e2));
        System.out.println(e1 + " / " + e2 + " = " + (e1 / e2));
        System.out.println(e1 + " % " + e2 + " = " + (e1 % e2)+"\n");
    }

    public static void runPrimitives(String[] args) {
        byte byte1 = 8;
        byte byte2 = 3;
        bytePrimitives(byte1, byte2);

        short short1 = 350;
        short short2 = 30;
        shortPrimitives(short1, short2);

        int int1 = 4500;
        int int2 = 550;
        intPrimitives(int1, int2);

        long long1 = 80503L;
        long long2 = 866L;
        longPrimitives(long1, long2);

        float float1 = 9.4656f;
        float float2 = 45.56655f;
        floatPrimitives(float1, float2);

        double double1 = 42.4656565d;
        double double2 = 2.465410065d;
        doublePrimitives(double1, double2);
    }
}
