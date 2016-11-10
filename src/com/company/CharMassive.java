package com.company;

import java.util.Random;

public class CharMassive {
    private static char vowels[] = {'A', 'E', 'I', 'O', 'U', 'Y'};
    private static char letters[] = new char[100];
    private static final char START_CHAR = 'A';

    public static void main (String []args){
        charMassiveGeneration();
        System.out.println("MAX Current cluster: " + (findMaxClusterSize() + 1));
    }

    private static int findMaxClusterSize() {
        int currentMaxClusterSize = 0;
        int currentClusterSize = 0;

        for (int i = 0; i < letters.length; i++){
            if (isVovel(letters[i])) {
                if (currentClusterSize > currentMaxClusterSize) {
                    currentMaxClusterSize = currentClusterSize;
                }
                currentClusterSize = 0;
            } else {
                currentClusterSize++;
            }
        }
        return currentMaxClusterSize;
    }

    private static boolean isVovel(char a) {
        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == a) {
                return true;
            }
        }
        return false;
    }

    private static void charMassiveGeneration() {
        Random randomGenerator = new Random();
        for (int i = 0; i < letters.length; i++){
            int randomInt = randomGenerator.nextInt(26);
            letters[i] = (char) (START_CHAR + randomInt);}
    }
}
