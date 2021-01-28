package com.company;

import java.util.Random;
import java.util.Scanner;

public class GenerateMatrix {

    public static int[] getUserInputs() {
        Scanner scanner = new Scanner(System.in);

        int[] dimensionArray = new int[5];

        System.out.println("Enter The Number Of Matrix Rows");
        dimensionArray[0] = scanner.nextInt(); // Amount of lines

        System.out.println("Enter The Number Of Matrix Columns");
        dimensionArray[1] = scanner.nextInt(); // Amount of poles

        System.out.println("Enter The Maximum Number");
        dimensionArray[2] = scanner.nextInt();

        System.out.println("If you want to multiply matrix on number, input 1");
        System.out.println("If you want to print matrix, input 2");
        dimensionArray[3] = scanner.nextInt();

        if (dimensionArray[3] == 1) {
            System.out.println("Enter a number to multiply");
            dimensionArray[4] = scanner.nextInt();
        }

        return dimensionArray;
    }

    public static void printMatrix(int[][] userMatrixDimensions, int[] userMatrixDimension){
        int[] userInput = userMatrixDimension;
        int[][] userMatrix = userMatrixDimensions;

        if (userMatrixDimension[3] == 1) {
            ActionsWithMatrix multiply = new ActionsWithMatrix();
            int[][] multipliedMatrix = multiply.multiplication(userInput, userMatrix);

            System.out.println("User matrix multiplied on: " + userInput[4]);
            for (int i = 0; i < multipliedMatrix.length; i++) {
                for (int j = 0; j < multipliedMatrix[i].length; j++) {
                    System.out.print(multipliedMatrix[i][j] + "\t");
                }
                System.out.println("\n");
            }
        } else {
            System.out.println("User matrix:");

            for (int i = 0; i < userMatrixDimensions.length; i++) {
                for (int j = 0; j < userMatrixDimensions[i].length; j++) {
                    System.out.print(userMatrixDimensions[i][j] + "\t");
                }
                System.out.println("\n");
            }
        }
    }

    public static int[][] createMatrix(int[] userMatrixDimensions){
        int line = userMatrixDimensions[0];
        int pole = userMatrixDimensions[1];
        int maxNumber = userMatrixDimensions[2];

        int[][] userMatrix = new int[line][pole];

        Random randomValues = new Random();

        for (int x = 0; x < line; x++) {
            for (int y = 0; y < pole; y++) {
                userMatrix[x][y] = randomValues.nextInt(maxNumber);
            }
        }
        return userMatrix;
    }
}
