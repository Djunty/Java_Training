package com.company;

import java.util.Arrays;
import java.util.Random;

public class CharMassiveSecond {
    private static final char START_CHAR = 'A';
    private static final char VOWELS[] = {'A', 'E', 'I', 'O', 'U', 'Y'};

    public static void main(String[]args){
        char letters[] = new char[100];
        charMassiveGeneration(letters);
        System.out.println(Arrays.toString(letters));
        System.out.println(vowelIndex(letters));

        char test1[] = {'S', 'D', 'F', 'Q', 'R', 'A', 'D', 'A', 'O', 'S', 'V', 'V'};
        System.out.println("MAX Jump cluster - result should be - 6 (test 1) = " + (vowelIndex(test1)));

        char test2[] = {'S', 'D', 'F', 'Q', 'S', 'D', 'S', 'V', 'V'};
        System.out.println("MAX Jump cluster - result should be - 10 (test 2) = " + (vowelIndex(test2)));

        char test3[] = {'A', 'A', 'A', 'A', 'A', 'A', 'A'};
        System.out.println("MAX Jump cluster - result should be - 1 (test 3) = " + (vowelIndex(test3)));

        char test4[] = {'O', 'D', 'F', 'Q', 'S', 'D', 'S', 'V', 'V'};
        System.out.println("MAX Jump cluster - result should be - 8 (test 4) = " + (vowelIndex(test4)));

        char test5[] = {'S', 'D', 'F', 'Q', 'S', 'D', 'S', 'V', 'E'};
        System.out.println("MAX Jump cluster - result should be - 9 (test 5) = " + (vowelIndex(test5)));
        }

    private static int vowelIndex (char[] letters){
        int currentIndex;
        int currentMaxIndex = 0;
        int jump;
        int maxJump = 0;

        for (int i = 0; i < letters.length; i++){
            char letter = letters[i];
            if (isVowel(letter)){
               currentIndex = i + 1;
               //System.out.println("Fuck! - " + currentIndex);
                if (currentIndex > currentMaxIndex){
                    jump = currentIndex - currentMaxIndex;
                    currentMaxIndex = currentIndex;
                        if (jump > maxJump){
                            maxJump = jump;
                        }
                }
            }
        }
        return maxJump;
    }

    private static boolean isVowel (char letter){
        for (int i = 0; i < VOWELS.length; i++){
            char vowel = VOWELS[i];
            if (vowel == letter){
                return true;
            }
        }
        return false;
    }

    private static void charMassiveGeneration(char[] letters){
         Random randomGeneration = new Random();
         for(int i = 0; i < letters.length; i++){
             int randomInt = randomGeneration.nextInt(26);
             letters[i] = (char) (START_CHAR + randomInt);}
     }
}
