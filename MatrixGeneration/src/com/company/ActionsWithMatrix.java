package com.company;

public class ActionsWithMatrix {
    public static int[][] multiplication(int[] userMatrixDimension, int[][] userMatrix) {
        int maxNumber = userMatrixDimension[4];

        int[][] multipliedMatrix = userMatrix;

        int line = userMatrixDimension[0];
        int pole = userMatrixDimension[1];

        for (int x = 0; x < line; x++) {
            for (int y = 0; y < pole; y++) {
                multipliedMatrix[x][y] *= maxNumber;
            }
        }
        return multipliedMatrix;
    }
}
