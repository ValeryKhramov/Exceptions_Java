package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

/* Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
   детализировать какие строки со столбцами не требуется.*/
public class Homework_one {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        numbers[0] = new int[]{5, 9, 8};
        numbers[1] = new int[]{9, 3};
        numbers[2] = new int[]{1, 3, 0};
        /*int[][] numbers = null;*/

        checkLenghtInMatrix(numbers);
    }

    public static void checkLenghtInMatrix(int[][] matrix) {

        try {
            if (matrix != null) {
                int[] countValue = new int[matrix.length];
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        countValue[j]++;
                    }
                }
                for (int i = 0; i < matrix.length ; i++) {
                    if (matrix[i].length != countValue[i]) {
                        throw new RuntimeException("Row length is not equal to column length");
                    }
                }
                System.out.println(Arrays.toString(countValue));
            } else {
                throw new RuntimeException("Matrix is empty");
            }

        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}