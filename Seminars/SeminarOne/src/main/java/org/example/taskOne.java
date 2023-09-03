package org.example;

public class taskOne {

    public static void main(String[] args) {

        int[] ints = new int[0];
        System.out.println(findValue(ints,11));

    }

    public static int findValue(int[] arr, int value) {
        if (arr == null){
            return -3;
        }

        if (arr.length < 1) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -2;

    }
}