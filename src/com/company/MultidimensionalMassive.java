package com.company;

import java.util.Random;

public class MultidimensionalMassive {
    public static void main (String[]args){
        int numbers [][] = new int[8][5];
        intRandomGeneratior(numbers);
    }

    private static void intRandomGeneratior (int [][] numbers){
        Random randomGenerator = new Random();
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 5; j++) {
                int randomInt = randomGenerator.nextInt(20) + 2;
                numbers[i][j] = (int) (randomInt);
            }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }

}
