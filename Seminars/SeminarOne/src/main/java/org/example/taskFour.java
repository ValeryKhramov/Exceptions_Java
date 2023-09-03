package org.example;

public class taskFour {
    public static void main(String[] args) {
        Integer[] ints = {0, null, 2, 3, 4, null, 6, 7, 8, 9};

        checkArray(ints);
    }

    public static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] == null) {
                    throw new RuntimeException("Encountered null at address " + i + ".");
                }
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
}

