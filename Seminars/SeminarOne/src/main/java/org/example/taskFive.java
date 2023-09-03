package org.example;

import java.util.Arrays;

public class taskFive {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        int[] ints1 = {6, 7, 8, 9, 0};

        System.out.println(Arrays.toString(joinArray(ints, ints1)));
    }

    public static int[] joinArray(int[] arr1, int[] arr2) {
        try {
            if (arr1 == null || arr2 == null) {
                throw new NullPointerException();
            }
            if (arr1.length != arr2.length) {
                throw new IllegalArgumentException();
            }

        } catch (NullPointerException e) {
            //e.printStackTrace();
            System.out.println("Found an empty array.");
            return null;

        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            System.out.println("The lengths of the arrays are not equal.");
        }
        int resultLength = Math.min(arr1.length, arr2.length);
        int[] result = new int[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = arr1[i] + arr2[i];
        }

        return result;
    }
}
