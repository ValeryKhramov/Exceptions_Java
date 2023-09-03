package org.example;

public class taskThree {
    public static void main(String[] args) {
        int[][] ints = new int[3][3];
        ints[0] = new int[]{0, 1, 0};
        ints[1] = new int[]{1, 2, 1};
        ints[2] = new int[]{0, 1, 0};

        try {
            System.out.println(matrixCount(ints));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Work is worked");

    }

    public static int matrixCount(int[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                throw new RuntimeException("The matrix is not square!");
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 && matrix[i][j] != 1) {
                    throw new RuntimeException("Incorrect value of the matrix cell!");
                } else {
                    result += matrix[i][j];
                }

            }
        }
        return result;
    }
}

