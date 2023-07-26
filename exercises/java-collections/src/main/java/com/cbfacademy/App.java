package com.cbfacademy;

import java.util.*; 

public class App {
    public static void main(String[] args) {
        int[] integerArray = { 4, 5, 6, 7, 8, 9, 10, 12 };
        System.out.println(integerArray[4]);

        float[] floatArray = { 5.5f, 6.5565f, 7.5f, 8.8f, 9.9f, 20.5f, 30.5f, 35.6f };
        System.out.println(floatArray[4]);

        double[] doubleArray = { 4.55, 5.778, 8.676, 9.565, 12.453, 213.343, 223124.5352, 12312.2476 };
        System.out.println(doubleArray[4]);

        boolean[] booleanArray = { true, false, true, false, true, false, true, false };
        System.out.println(booleanArray[4]);

        int[] newIntegerArray = new int[5];

        for (int x = 0; x < newIntegerArray.length; x++) {
            newIntegerArray[x] = x * 5;
        }

        System.out.println(newIntegerArray[3]);

        Object[][] allArrays = { { integerArray, floatArray, doubleArray, booleanArray } };

        System.out.println(allArrays);

        



    }
}
