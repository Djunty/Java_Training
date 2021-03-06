package com.company;

import java.util.Random;

import static java.lang.Math.max;

public class CharMassive {
    private static final char START_CHAR = 'A';
    private static final char VOWELS[] = {'A', 'E', 'I', 'O', 'U', 'Y'};

    public static void main (String []args){
        char letters[] = new char[100];
        charMassiveGeneration(letters);
        System.out.println("MAX Current cluster: " + (findMaxClusterSize(letters) + 1));

        char test1[] = {'S', 'D', 'F', 'Q', 'A', 'S', 'D', 'A', 'O', 'S', 'V', 'V'};
        System.out.println("MAX Current cluster (test 1): " + (findMaxClusterSize(test1) + 1));

        char test2[] = {'S', 'D', 'F', 'Q', 'S', 'D', 'S', 'V', 'V'};
        System.out.println("MAX Current cluster (test 2): " + (findMaxClusterSize(test2) + 1));

        char test3[] = {'A', 'A', 'A', 'A', 'A', 'A', 'A'};
        System.out.println("MAX Current cluster (test 3): " + (findMaxClusterSize(test3) + 1));

        char test4[] = {'O', 'D', 'F', 'Q', 'S', 'D', 'S', 'V', 'V'};
        System.out.println("MAX Jump cluster - result should be - 8 (test 4) = " + (findMaxClusterSize(test4)));

        char test5[] = {'S', 'D', 'F', 'Q', 'S', 'D', 'S', 'V', 'E'};
        System.out.println("MAX Jump cluster - result should be - 8 (test 5) = " + (findMaxClusterSize(test5)));
    }



    private static int findMaxClusterSize(char [] letters) {
        int currentMaxClusterSize = 0;
        int currentClusterSize = 0;

        for (char letter: letters){
            if (isVovel(letter)) {
                currentMaxClusterSize = max(currentMaxClusterSize, currentClusterSize);
                /*if (currentClusterSize > currentMaxClusterSize) {
                    currentMaxClusterSize = currentClusterSize;
                }*/
                currentClusterSize = 0;
            } else {
                currentClusterSize++;
            }
        }
        currentMaxClusterSize = max(currentMaxClusterSize, currentClusterSize);
        /*if (currentClusterSize > currentMaxClusterSize) {
            currentMaxClusterSize = currentClusterSize;
        }*/
        currentMaxClusterSize = currentClusterSize > currentMaxClusterSize ? currentClusterSize : currentMaxClusterSize;

        return currentMaxClusterSize;
    }

    private static boolean isVovel(char letter) {
        // for (int i = 0; i < VOWELS.length; i++) {
        //    char vowel = VOWELS[i];
        for (char vowel: VOWELS) {
            if (vowel == letter) {
                return true;
            }
        }
        return false;
    }

    private static void charMassiveGeneration(char [] letters) {
        Random randomGenerator = new Random();
        for (int i = 0; i < letters.length; i++){
            int randomInt = randomGenerator.nextInt(26);
            letters[i] = (char) (START_CHAR + randomInt);}
    }
}
