package com.company;

public class Main {

    public static void main(String[] args) {
        GenerateMatrix generateMatrix = new GenerateMatrix();
        int[] userInputs = generateMatrix.getUserInputs();
        int[][] userMatrix = generateMatrix.createMatrix(userInputs);

        generateMatrix.printMatrix(userMatrix, userInputs);
    }

}
